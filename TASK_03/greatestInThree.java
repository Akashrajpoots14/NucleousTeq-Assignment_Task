import java.util.Scanner;

public class greatestInThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1 : ");
        int firstNum = sc.nextInt();
        System.out.print("Number 2 : ");
        int secondNum = sc.nextInt();
        System.out.print("Number 3 : ");
        int thirdNum = sc.nextInt();
        System.out.println((firstNum>secondNum)?((firstNum>thirdNum)
        ?firstNum:thirdNum):((firstNum>thirdNum)?secondNum:thirdNum));
    }
}
