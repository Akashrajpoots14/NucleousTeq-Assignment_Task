import java.util.*;
public class GenericsTest {
    public static void main(String[] args) {
        HashMap<Integer,String> StudentDetails = new HashMap<>();
        StudentDetails.put(1,"Akash");
        StudentDetails.put(2,"Harsh");
        StudentDetails.put(3,"Yuvraj");
        StudentDetails.put(4,"Umesh");

        Set<Map.Entry<Integer,String>> set = StudentDetails.entrySet();  
  
        Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
        while(itr.hasNext()){  
        Map.Entry e=itr.next();//no need to typecast  
        System.out.println(e.getKey()+" "+e.getValue());  
        }  
    }
    
}