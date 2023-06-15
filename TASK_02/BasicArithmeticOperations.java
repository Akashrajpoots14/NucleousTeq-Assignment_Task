import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();
        
        // Addition
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        
        // Subtraction
        int difference = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        
        // Multiplication
        int product = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
        
        // Division
        double quotient = (double) firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);
        
        // Remainder
        int remainder = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + remainder);
    }
}
