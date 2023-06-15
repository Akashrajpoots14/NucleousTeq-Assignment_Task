package TASK_4.FILE_HANDLING.InputOutPutStream;
import java.io.FileOutputStream;  
public class OutPutStreamDemo {
    public static void main(String args[]){    
        try{    
          FileOutputStream fout=new FileOutputStream("C:\\Users\\akash\\OneDrive\\Desktop\\NucleousTeq TAsk\\TASK_4\\FILE_HANDLING\\FileExample.txt");    
          String s="Welcome to NucleousTeq";    
          byte b[]=s.getBytes();//converting string into byte array    
          fout.write(b);    
          fout.close();    
          System.out.println("success...");    
         }catch(Exception e){System.out.println(e);}    
   }   
}
