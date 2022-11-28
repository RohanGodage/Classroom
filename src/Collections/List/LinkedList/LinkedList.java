package Collections.List.LinkedList;

import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        List linkedList = new java.util.LinkedList();
        linkedList.add(130);
        linkedList.add(330);
        linkedList.add(310);
        linkedList.add(30);
        linkedList.add(305);
        linkedList.add(10);


        System.out.println("Before sorting : "+linkedList);
        //LINKED HASH SET = INSERTION ORDER IS MAINTAINED AND SORTING ORDER ISN'T.

        //HASH SET = NOTHING IS MAINTAINED (NEITHER I.O.(INSERTION ORDER) OR S.O.(SORTING ORDER).
        //List hashset = new HashSet<HashSet>();

        //SORTED HASH SET = INSERTION ORDER IS MAINTAINED AND SORTING ORDER ISN'T.
        Collections.sort(linkedList);
        System.out.println("After Sorting : " + linkedList);
    }
}
