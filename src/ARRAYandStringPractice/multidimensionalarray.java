package ARRAYandStringPractice;

import java.util.Scanner;

public class multidimensionalarray {
    public static void main(String[] args) {
        int[][] arr1= new int[3][3];
        Scanner sc = new Scanner(System.in);
        int start = 1;
        int start2 = 10;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
               // System.out.println("Enter value at " + (i+1) + " row and "+ (j+1) +" column : ");
                arr1[i][j]= start;
                start++;
            }
        }
        //print first array
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++)
            {
                    System.out.print(arr1[i][j]+" ");
                }
            System.out.println(" ");

        }
        //sum of two multi dimensional arrayss
        //creating second array
        int[][] arr2= new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                // System.out.println("Enter value at " + (i+1) + " row and "+ (j+1) +" column : ");
                arr1[i][j]= start;
                start++;
            }
        }
        //print second m.d. array
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println(" ");

        }


        }
}
