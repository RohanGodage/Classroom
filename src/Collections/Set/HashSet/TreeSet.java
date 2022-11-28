package Collections.Set.HashSet;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        /*'unique elements - Yes
        homogeneous - Yes
        heterogeneous - No
        null-cannot hold even once
        insertion order not maintained
        elements will be in sorting order
        Internally uses Red Black Tree Data Structure

         */
        Set integers = new java.util.TreeSet();
        System.out.println(integers.add(10));
        System.out.println(integers.add(30));
        System.out.println(integers.add(30));
        System.out.println(integers.add(50));
        System.out.println(integers.add(40));
        System.out.println(integers.add(30));
        System.out.println(integers.add(20));
        System.out.println(integers.add(110));
        System.out.println(integers.add(110));
        System.out.println(integers.add(-110));

        System.out.println(integers);
    }
}
