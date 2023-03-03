package TASK_3.Account;

public class LoadAccount extends Account {

    public LoadAccount(long accountNumber, String name, long phoneNo, String dob, double balance) {
        super(accountNumber, name, phoneNo, dob, balance);
        //TODO Auto-generated constructor stub
    }
    public void payEMI() {
        System.out.println("Pay EMI");
    }

    public void topUpLoan() {
        System.out.println("Top Up Loan");
    }

    public void repayment() {
        System.out.println("Re-Payment");
    }
    
}
