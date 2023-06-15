package ASSIGNMENT.SET_PROGRAM;
import java.util.*;
public class SetProram1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3, 3, 3, 3};

        
        System.out.println("Array Elements");
        System.out.println(Arrays.toString(arr));

        Set<Integer> set = new HashSet();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println("After Deletion of  Unique Elements");
        System.out.println(set);
    }
}
