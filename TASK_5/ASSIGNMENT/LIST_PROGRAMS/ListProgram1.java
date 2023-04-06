package ASSIGNMENT.LIST_PROGRAMS;

import java.util.HashSet;
import java.util.*;

public class ListProgram1 {

    public static void main(String[] args) {
        Set<Integer> uniqueElements = new HashSet<>();
        ArrayList<Integer> elements = new ArrayList<>();
        uniqueElements.add(1);
        uniqueElements.add(2);
        uniqueElements.add(1);
        uniqueElements.add(2);
        uniqueElements.add(1);
        uniqueElements.add(2);
        uniqueElements.add(1);
        elements.addAll(uniqueElements);
        for(int i : elements){
            System.out.println(i);
        }

    }
}