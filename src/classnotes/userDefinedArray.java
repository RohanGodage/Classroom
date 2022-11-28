package classnotes;

import java.util.Scanner;

public class userDefinedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i =0;i<=array.length;i++) {
            array[i] = sc.nextInt();
        }
        for(int i =0;i<=array.length;i++) {
            System.out.println("array[" + i + "]element : "+array[i]);
        }
    }
}
