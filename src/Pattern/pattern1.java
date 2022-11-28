package Pattern;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        int space = 3;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=space - i; j++) {
                for (int k = 0; k <= i; k++) {
                    System.out.print(" ");

                }
                System.out.println("*");
            }
        }
    }
}
