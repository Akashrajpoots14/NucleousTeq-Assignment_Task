package TASK_4.FILE_HANDLING.InputOutPutStream;
import java.io.FileInputStream;
public class InputStreamDemo {
    public static void main(String args[]){    
        try{    
          FileInputStream fin=new FileInputStream("C:\\Users\\akash\\OneDrive\\Desktop\\NucleousTeq TAsk\\TASK_4\\FILE_HANDLING\\FileExample.txt");    
          int i=0;    
          while((i=fin.read())!=-1){    
           System.out.print((char)i);    
          }    
          fin.close();    
        }catch (Throwable ex) {
            ex.printStackTrace();
        } 
}
}
