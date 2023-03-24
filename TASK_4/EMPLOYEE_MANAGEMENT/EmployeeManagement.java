package TASK_4.EMPLOYEE_MANAGEMENT;
import java.io.*;
import java.util.*;

public class EmployeeManagement {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Employee emp = new Employee();
        BufferedWriter writer = null;

        while(true){
            try{
                writer = new BufferedWriter(new FileWriter("C:\\Users\\akash\\OneDrive\\Desktop\\NucleousTeq TAsk\\TASK_4\\FILE_HANDLING\\FileExample.txt",true));
            } catch(IOException ex){
                    System.out.println(ex);
            }

            System.out.println("Enter Name ");
            emp.setName(scan.nextLine());
            System.out.println("Enter Age ");
            emp.setAge(scan.nextInt());
            System.out.println("Enter EMPID");
            emp.setEmpId(scan.nextInt());
            System.out.println("Enter EmailId ");
            emp.setEmailId(scan.nextLine());
            System.out.println("Enter mobile Number");
            emp.setMobileNumber(scan.nextLine());
            System.out.println("Enter Desgination");
            emp.setDesignation(scan.nextLine());
            System.out.println("Enter Salary");
            emp.setSalary(scan.nextInt());

            writer.write(emp.toString());
            writer.close();
        }
    }
}
