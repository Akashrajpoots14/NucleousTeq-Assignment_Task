package TASK_3.Account;

public class TestAccount {
    public static void main(String[] args) {

        LoadAccount la = new LoadAccount(1980521, "AkashRajpoot", 799922935, "15/Apr/2000", 5000.04);
        SavingAccount sa = new SavingAccount(882774, "Harshita ", 942564388, "31/dec/1995", 3500.34);
        System.out.println("Name : " + sa.getName());
        sa.closeAccount();
        sa.withDraw();
        sa.deposite();
        sa.fixedDeposite();
        System.out.println("Name : " + la.getName());
        la.closeAccount();
        la.payEMI();
        la.repayment();
        la.topUpLoan();
        
       
    }
}
