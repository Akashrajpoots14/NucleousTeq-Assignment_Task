package ASSIGNMENT.LIST_PROGRAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListProgram2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        while (true) {
            int choice = 0;
            Scanner sc = new Scanner(System.in);

            System.out.println("\nPress 1 for Add");
            System.out.println("Press 2 for Remove");
            System.out.println("Press 3 for View");
            System.out.println("Press 4 for Exit");
            System.out.print("\nEnter = ");

            try {
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter new Element = ");
                        Object newElement = sc.next();
                        list.add(newElement);
                        break;
                    case 2:
                        System.out.println("Enter element want to Delete = ");
                        Object delElement = sc.next();
                        if (list.isEmpty()) {
                            System.out.println("List is Empty");
                        } else {
                            if (!list.contains(delElement)) {
                                System.out.println("List Not Contain This Element");
                            } else {
                                list.remove(delElement);
                            }
                        }
                        break;
                    case 3:
                        if (list.isEmpty()) {
                            System.err.println("List is Empty");
                        } else {
                            System.out.println();
                            for (Object object : list) {
                                System.out.println("\t" + object);
                            }
                        }
                        break;
                    case 4:
                        System.err.println("Exit");
                        return;
                    default:
                        System.err.println("Please Enter Correct Input");
                }
            } catch (Exception e) {
                System.err.println("Please enter Integer btwn 1 to 4");
            }
        }
    }
}
