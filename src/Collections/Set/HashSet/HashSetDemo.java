package Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set integers = new HashSet();
        System.out.println(integers.add(10));
        System.out.println(integers.add(10));
        System.out.println(integers.add("abc"));
        System.out.println(integers.add("abc"));
        System.out.println(integers.add(null));
        System.out.println(integers);
        System.out.println("Unique values not stored + No sorting order + No insertion order ");

    }
}
