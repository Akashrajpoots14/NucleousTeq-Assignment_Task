import java.util.*;
import java.util.regex.*;
import java.util.Scanner;

public class validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((Pattern.matches("[0-9]{6}",Integer.toString(num)))){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }    
}
