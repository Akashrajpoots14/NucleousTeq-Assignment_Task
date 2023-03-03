import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount of Rupees : ");
        Double Rupees = sc.nextDouble();
        System.out.println("Dollar = $" + Rupees/82.12);
    }
}
