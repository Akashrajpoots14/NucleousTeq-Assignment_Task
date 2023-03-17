package UNCHECKED_EXCEPTION;

import java.util.Scanner;

public class IOException_Demo {
    public static void main(String[] args)
    {      
        Scanner scan = new Scanner("Hello Geek!");
        System.out.println("" + scan.nextLine());
        System.out.println("Exception Output: "
                           + scan.ioException());
        scan.close();
    }
}
