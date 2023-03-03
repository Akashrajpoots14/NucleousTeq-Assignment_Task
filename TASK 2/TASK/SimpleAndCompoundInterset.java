import java.util.Scanner;

public class SimpleAndCompoundInterset {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Principle : ");
        double Principle = sc.nextDouble();
        System.out.print("Enter Rate : ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time Period : ");
        double time_period = sc.nextDouble();
        
        double SimpleInterset = (Principle*rate*time_period)/100;
        System.out.println("Simple Interest = " + SimpleInterset);
        double compound_interest = Principle * (Math.pow((1 + rate / 100), time_period)) - Principle;
        System.out.println("Compound Interest = " + compound_interest);
            
    }    
}
