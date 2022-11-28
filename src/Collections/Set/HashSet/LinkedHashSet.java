package Collections.Set.HashSet;

import java.util.HashSet;

public class LinkedHashSet {
    public Object add;

    public static void main(String[] args) {
//        hashset => 1) unique
//                   2) null only stored
        HashSet hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add(null);
        hashSet.add(10);
        hashSet.add(20);
        System.out.println(hashSet);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet<>();
        System.out.println(linkedHashSet.add(10));
        System.out.println(linkedHashSet.add(10));
        System.out.println(linkedHashSet.add("abc"));
        System.out.println(linkedHashSet.add("abc"));
        System.out.println(linkedHashSet.add(null));
        System.out.println(linkedHashSet);

    }
}
