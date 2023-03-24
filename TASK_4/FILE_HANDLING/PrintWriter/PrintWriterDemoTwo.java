package TASK_4.FILE_HANDLING.PrintWriter;
import java.io.*;
public class PrintWriterDemoTwo {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\akash\\OneDrive\\Desktop\\NucleousTeq TAsk\\TASK_4\\FILE_HANDLING\\FileExample.txt");
            PrintWriter printWriter = new PrintWriter(new FileWriter(f, true));
            
            printWriter.println("Append text");
            
            System.out.println("Append Successfully");
            printWriter.close();
            
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
