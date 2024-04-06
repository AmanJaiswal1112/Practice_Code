package com.prac.stream;

import java.util.Arrays;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class All_Intermediate_Operations_AND_Terminal_Operations {
    public static void main(String[] args) {
        List<Payment> payments = Arrays.asList(
                new Payment("1", "John", new BigDecimal("100.50"), Payment.PaymentStatus.APPROVED, LocalDate.now()),
                new Payment("2", "Mary", new BigDecimal("200.75"), Payment.PaymentStatus.PENDING, LocalDate.now().minusDays(60)),
                new Payment("3", "John", new BigDecimal("50.00"), Payment.PaymentStatus.APPROVED, LocalDate.now()),
                new Payment("4", "Bob", new BigDecimal("150.25"), Payment.PaymentStatus.REJECTED, LocalDate.now()),
                new Payment("5", "Mary", new BigDecimal("75.00"), Payment.PaymentStatus.PENDING, LocalDate.now().minusDays(15))
        );

        callIntermediateOperations(payments);
        callTerminalOperations(payments);
    }

    private static void callTerminalOperations(List<Payment> payments) {

        // count(): This terminal operation returns the number of elements in the stream.
        Long count = payments.stream().count();
        System.out.println(count);

        // forEach(): This terminal operation performs an action for each element in the stream.
        payments.stream().forEach(t-> System.out.println(t));

        // max(): This terminal operation returns the maximum element of the stream, according to a given comparator.
        Optional<Payment> optionalPayment = payments.stream().max(Comparator.comparing(Payment::getAmount));
        optionalPayment.ifPresent(payment -> System.out.println("Maximum payment amount: " + payment.getAmount()));

        // min(): This terminal operation returns the minimum element of the stream, according to a given comparator.
        Optional<Payment> optionalPaymentmin = payments.stream().min(Comparator.comparing(Payment::getAmount));
        optionalPaymentmin.ifPresent(payment -> System.out.println("Min payment amount: " + payment.getAmount()));

        // reduce(): This terminal operation reduces the elements of the stream to a single value, according to a given binary operator.
        Optional<BigDecimal> totalAmount = payments.stream().map(Payment::getAmount).reduce(BigDecimal::add);
        totalAmount.ifPresent(bigDecimal -> System.out.println("Total amount: " + bigDecimal));

    }

    private static void callIntermediateOperations(List<Payment> payments) {

        // filter() to get only the approved payments:
        // filter() to get only the approved payments made by John:
        List<Payment> approvedPaymentsByJohn = payments.stream().filter(t->t.isApproved() && t.getCustomerName().equals("John")).collect(Collectors.toList());
        System.out.println(approvedPaymentsByJohn);

        // map() to transform the Payment objects into their amounts:
        List<BigDecimal> paymentAmounts = payments.stream().map(t->t.getAmount()).collect(Collectors.toList());
        System.out.println(paymentAmounts);

        // sorted() to sort the payments by their amount in descending order:
        List<Payment> sortedPayments = payments.stream().sorted(Comparator.comparing(Payment::getAmount)).collect(Collectors.toList());
        System.out.println(sortedPayments);

        // distinct() to get the unique customer names:
        List<String> uniqueCustomerNames = payments.stream().map(Payment::getCustomerName).distinct().collect(Collectors.toList());
        System.out.println(uniqueCustomerNames);

        // limit() to get the first two payments made by Mary:
        List<Payment> firstTwoPaymentsByMary = payments.stream().filter(t->t.getCustomerName().equals("Mary")).limit(2).collect(Collectors.toList());
        System.out.println(firstTwoPaymentsByMary);

    }
}
class Payment {
    private String id;
    private String customerName;
    private BigDecimal amount;
    private PaymentStatus status;
    private LocalDate date;
    public Payment(String id, String customerName, BigDecimal amount, PaymentStatus status, LocalDate date) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", status=" + status +
                ", date=" + date +
                '}';
    }

    public boolean isApproved() {
        return status == PaymentStatus.APPROVED;
    }

    public boolean isOverdue() {
        return status == PaymentStatus.PENDING && LocalDate.now().isAfter(date.plusDays(30));
    }

    public void approve() {
        status = PaymentStatus.APPROVED;
    }

    public void reject() {
        status = PaymentStatus.REJECTED;
    }

    public void markAsPending() {
        status = PaymentStatus.PENDING;
    }

    public enum PaymentStatus {
        PENDING,
        APPROVED,
        REJECTED
    }
}
