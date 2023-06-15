package TASK_4.FILE_HANDLING.FileWriter;
import java.util.*;
import java.io.FileWriter;
public class FileWriterDemo {
    public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("D:\\testout.txt");    
          fw.write("Welcome to NucleousTeq Assignments");    
          fw.close();    
         }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");    
    }        
}
