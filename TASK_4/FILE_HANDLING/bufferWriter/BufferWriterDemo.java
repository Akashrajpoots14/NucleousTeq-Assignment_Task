//package TASK_4.FILE_HANDLING.bufferWriter;
import java.io.*;  
public class BufferWriterDemo {
    public static void main(String[] args) throws Exception {     
        FileWriter writer = new FileWriter("C:\\Users\\akash\\OneDrive\\Desktop\\NucleousTeq TAsk\\TASK_4\\FILE_HANDLING\\FileExample.txt");  
        BufferedWriter buffer = new BufferedWriter(writer);  
        buffer.write("Welcome to NucleousTeq.");  
        buffer.close();  
        System.out.println("Success");  
        }  
}
