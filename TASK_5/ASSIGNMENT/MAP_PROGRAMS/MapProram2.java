package ASSIGNMENT.MAP_PROGRAMS;

//package ASSIGNMENT.MAP_PROGRAMS;
import java.util.*;
public class MapProram2 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String sentence = sc.nextLine();

        for (char ch : sentence.toCharArray()) {
            list.add(ch);
        }

        Character space = ' ';
        list.remove(space);

        Map<Object, Integer> map = new LinkedHashMap();
        for (Object object : list) {
            if (map.containsKey(object)) {
                map.put(object,map.getOrDefault(object, 0)+1);
            } else {
                map.put(object,map.getOrDefault(object, 0)+1);
            }
        }

        System.out.println(map);
    }
}
