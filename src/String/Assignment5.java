package String;

import classnotes.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Assignment5 extends ArrayList {
    public static void main(String[] args) {
        String [] array1 = {"My name is : ","Euuuu"};
        String [] array2 = {"Rohan Madhukar Godage"};
        ArrayList list = new ArrayList();

        list.addAll(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));
        Object [] arrayfinal = list.toArray();
        System.out.println(Arrays.toString(arrayfinal));

    }
}
