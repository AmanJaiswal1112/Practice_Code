/*
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Account {

    private String accountId;
    private String accountHolderName;
    private double balance;
    private List<String> transactionHistory;

    public Account(String accountId, String accountHolderName) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
        this.transactionHistory = new ArrayList<>();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
}


class OnlineBankingSystem{
    private Map<String, Account> accounts;

    public OnlineBankingSystem(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    public void createAccount(String accountId, String accountHolderName){
        if(!accounts.containsKey(accountId)){
            Account account = new Account(accountId, accountHolderName);
            accounts.put(accountId, account);
            System.out.println("Account created successfully");
        }else{
            System.out.println("Account id already exist");
        }
    }


    public void deposite(String accountID, double amount){
        Account account = accounts.get(accountID);
        if (account != null) {
            account.deposite(amount);
            System.out.println("DEposite completed");
        }else
        {
            System.out.println("Account not found");
        }
    }

    public void deposite(String accountID, double amount){
        Account account = accounts.get(accountID);
        if (account != null) {
            account.withdraw(amount);
            System.out.println("withdraw completed");
        }else
        {
            System.out.println("Account not found");
        }
    }

    public void transfer(String senderId , String receipentId , double amount){

    }


}


public class Test {
    public static void main(String[] args) {
        System.out.println("Herllo");
    }
}*/
