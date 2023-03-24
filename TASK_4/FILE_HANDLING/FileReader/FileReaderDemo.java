package TASK_4.FILE_HANDLING;
// Java Program to demonstrate the use of read() 
// method of FileReader class in Java
  
import java.io.FileReader;
  
public class FileReaderDemo {
    public static void main(String args[])
    {
        try {
            FileReader fileReader = new FileReader(
                "C:\\Users\\akash\\OneDrive\\Desktop\\NucleousTeq TAsk\\TASK_4\\FILE_HANDLING\\FileExample.txt");
            int i;
            while ((i = fileReader.read()) != -1)
                System.out.print((char)i);
            fileReader.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}