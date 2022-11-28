package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayMerge {
    public static void main(String[] args) {
        String[] str1 = {"xyz","abc","pqr"} ;
        String [] str2 = {"jkl","mno"};
        ArrayList list = new ArrayList<>();
        Object[]  obj = list.toArray();
        System.out.println(Arrays.toString(obj));


        //OTHER METHOD
        String[] str3 = {"xyz","abc","pqr"} ;
        String [] str4 = {"jkl","mno","ghi"};
        int str3length = str3.length;
        int str4length = str4.length;
        int newstringlength = str3length+str4length;
        int [] newstr = new int[newstringlength];

        for (int i = 0; i < str3length; i++) {
            newstr[i] = Integer.parseInt(str3[i]);

        }
        List finallist = new ArrayList();
        for (int i = 0; i < newstringlength; i++) {
            System.out.println(finallist);
        }
    }
}
