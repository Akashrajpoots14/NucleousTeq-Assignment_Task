package TASK_4.FILE_HANDLING;
import java.io.*; 
public class BufferReaderDemo {
    public static void main(String args[])throws Exception{    
        FileReader fr=new FileReader("C:\\Users\\akash\\OneDrive\\Desktop\\NucleousTeq TAsk\\TASK_4\\FILE_HANDLING\\FileExample.txt");    
        BufferedReader br=new BufferedReader(fr);    

        int iteratingData;    
        while((iteratingData=br.read())!=-1){  
        System.out.print((char)iteratingData);  
        }  
        br.close();    
        fr.close();    
  }   
}
