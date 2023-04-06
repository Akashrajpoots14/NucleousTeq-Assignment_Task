package ASSIGNMENT.MAP_PROGRAMS;
import java.util.*;
public class MapProgram1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(20);
        list.add(20);

        Map<Integer, Integer> map = new HashMap();

        for (int i : list) {
            if (map.containsKey(i)) {
                map.put(i,map.getOrDefault(i, 0)+1);   
            } else {
                map.put(i,map.getOrDefault(i, 0)+1);
            }
        }

        System.out.println(map);
    }
}
