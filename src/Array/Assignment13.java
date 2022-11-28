package Array;

import classnotes.Array;

import java.util.Arrays;

public class Assignment13 {
    int secondsmallestNo(int []  array1) {
        int smallestNo = Integer.MAX_VALUE;
        int secondSmallestno = smallestNo - 1;
        for (int i = 0; i < array1.length; i++) {

            if (array1[i] < smallestNo) {
                smallestNo = array1[i];
                secondSmallestno = smallestNo;
            } else if (smallestNo < array1[i] && array1[i] < secondSmallestno) {
                secondSmallestno = array1[i];
            }
            return secondSmallestno;
        }
        return secondSmallestno;
    }


    public static void main(String[] args){
            int[] array = {12, 32, 42, 57, 98, 31,  9, 98, 8, 67};
           Assignment13 assignment13 = new Assignment13();
        Arrays.sort(array);
        System.out.println("Second smallest no is : "+assignment13.secondsmallestNo(array));





    }
}
