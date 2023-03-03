package TASK_3.Account;

public class Account {
    private long accountNumber;
    private String name;
    private long phoneNo;
    private String dob;
    private double balance;


    public Account(long accountNumber, String name, long phoneNo, String dob, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }
    public void closeAccount() {
        System.out.println("Close Account");
    }


    public long getPhoneNo() {
        return phoneNo;
    }
    public String getDob() {
        return dob;
    }
    public String getName() {
        return name;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }



}
