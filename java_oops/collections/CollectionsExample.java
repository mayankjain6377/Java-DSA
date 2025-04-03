package java_oops.collections;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(52);
        numbers2.add(31);
        numbers2.add(8);

       numbers.removeAll(numbers2);
        System.out.println(numbers2);
        // Sorting using Collections utility class
        Collections.sort(numbers2);
        System.out.println("Sorted list: " + numbers);

 Set <Integer> set=new HashSet<>();
        set.add(21);
        set.add(21);
        set.add(32);
        System.out.println(set);
        System.out.println(set.remove(21));


        Map<String,Integer>map=new HashMap<>();
        map.put("SKIT",1);
        map.put("PCE",2);
        map.put("PIET",3);
        System.out.println(map);
        System.out.println(map.getOrDefault("ARYA",10));


    }
}