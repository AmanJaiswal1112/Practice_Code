package com.prac.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

 class Order {

    private Integer id;
    private String invoice;
    private List<LineItem> lineItems;
    private BigDecimal total;

     public <T> Order(int i, String a0000003, List<LineItem> asList, BigDecimal bigDecimal) {
         this.invoice = a0000003;
         this.lineItems = asList;
         this.total = bigDecimal;
     }

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public String getInvoice() {
         return invoice;
     }

     public void setInvoice(String invoice) {
         this.invoice = invoice;
     }

     public List<LineItem> getLineItems() {
         return lineItems;
     }

     public void setLineItems(List<LineItem> lineItems) {
         this.lineItems = lineItems;
     }

     public BigDecimal getTotal() {
         return total;
     }

     public void setTotal(BigDecimal total) {
         this.total = total;
     }
 }

 class LineItem {

    private Integer id;
    private String item;
    private Integer qty;
    private BigDecimal price;
    private BigDecimal total;

     public LineItem(int i, String apple, int i1, BigDecimal bigDecimal, BigDecimal bigDecimal1) {
         this.item = apple;
         this.qty = i1;
         this.price = bigDecimal;
         this.total = bigDecimal1;
     }

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public String getItem() {
         return item;
     }

     public void setItem(String item) {
         this.item = item;
     }

     public Integer getQty() {
         return qty;
     }

     public void setQty(Integer qty) {
         this.qty = qty;
     }

     public BigDecimal getPrice() {
         return price;
     }

     public void setPrice(BigDecimal price) {
         this.price = price;
     }

     public BigDecimal getTotal() {
         return total;
     }

     public void setTotal(BigDecimal total) {
         this.total = total;
     }
 }

public class FlatMapExample2 {
    public static void main(String[] args) {
        List<Order> orders = findAll();
        BigDecimal sumOfLineItems = orders.stream()
                .flatMap(order -> order.getLineItems().stream())    //  Stream<LineItem>
                .map(line -> line.getTotal())                       //  Stream<BigDecimal>
                .reduce(BigDecimal.ZERO, BigDecimal::add);          //  reduce to sum all
        // sum the order's total amount
        BigDecimal sumOfOrder = orders.stream()
                .map(order -> order.getTotal())                     //  Stream<BigDecimal>
                .reduce(BigDecimal.ZERO, BigDecimal::add);          //  reduce to sum all
        System.out.println(sumOfLineItems);                         // 3194.20
        System.out.println(sumOfOrder);                             // 3194.20
        if (!sumOfOrder.equals(sumOfLineItems)) {
            System.out.println("The sumOfOrder is not equals to sumOfLineItems!");
        }
    }
        private static List<Order> findAll() {
            LineItem item1 = new LineItem(1, "apple", 1, new BigDecimal("1.20"), new BigDecimal("1.20"));
            LineItem item2 = new LineItem(2, "orange", 2, new BigDecimal(".50"), new BigDecimal("1.00"));
            Order order1 = new Order(1, "A0000001", Arrays.asList(item1, item2), new BigDecimal("2.20"));
            LineItem item3 = new LineItem(3, "monitor BenQ", 5, new BigDecimal("99.00"), new BigDecimal("495.00"));
            LineItem item4 = new LineItem(4, "monitor LG", 10, new BigDecimal("120.00"), new BigDecimal("1200.00"));
            Order order2 = new Order(2, "A0000002", Arrays.asList(item3, item4), new BigDecimal("1695.00"));
            LineItem item5 = new LineItem(5, "One Plus 8T", 3, new BigDecimal("499.00"), new BigDecimal("1497.00"));
            Order order3 = new Order(3, "A0000003", Arrays.asList(item5), new BigDecimal("1497.00"));
            return Arrays.asList(order1, order2, order3);
        }
    }

