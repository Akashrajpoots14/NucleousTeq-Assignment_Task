import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();
        
        double product = firstNumber * secondNumber;
        
        System.out.println("The product is" + product);
    }
}
