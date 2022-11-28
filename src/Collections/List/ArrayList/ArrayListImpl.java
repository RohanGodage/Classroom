package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import  java.util.List;
public class ArrayListImpl<S> {
    public static void main(String[] args) {
        List arraylist = new ArrayList();
        arraylist.add(30);
        //arraylist.add("abc");
        arraylist.add(40);
        arraylist.add(20);
        arraylist.add(45);
        arraylist.add(40);
        arraylist.add("abc");
        //arraylist.add(null);
        //arraylist.add(null);
        System.out.println(arraylist);
        Collections.sort(arraylist.stream().toList());
        System.out.println("Array list : cannot sort heterogenous data types.");
        System.out.println(arraylist);

    }
}
