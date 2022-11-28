package Array;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int sum =0;
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i =0;i< array.length;i++){
            System.out.println("Enter "+i+"th element : ");
        array[i]=scanner.nextInt();
        }
        for(int i =0;i< array.length;i++){
            sum+=array[i];

        }
        System.out.println(sum);
    }
}
