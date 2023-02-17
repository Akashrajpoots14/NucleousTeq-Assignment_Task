import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();
        
        double result = firstNumber / secondNumber;
        
        System.out.println(firstNumber + " / " + secondNumber + " = " + result);
    }
}
