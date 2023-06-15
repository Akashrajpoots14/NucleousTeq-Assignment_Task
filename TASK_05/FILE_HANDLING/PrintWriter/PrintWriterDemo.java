package TASK_4.FILE_HANDLING.PrintWriter;
import java.io.*;
public class PrintWriterDemo {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\akash\\OneDrive\\Desktop\\NucleousTeq TAsk\\TASK_4\\FILE_HANDLING\\FileExample.txt");
            PrintWriter printWriter = new PrintWriter(f);
            printWriter.println("Integer = " + 10);
            printWriter.println("Float = " + 98.23);
            printWriter.println("Character = " + 'A');
            printWriter.println("String = " + "Akash");
            printWriter.println("Boolean = " + true);
            
            
            System.out.println("Write Successfully");
            printWriter.close();
            
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
