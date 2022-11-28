package Operators;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        int reversenumber=0;
        while (number>0)
        {
            reversenumber=10*reversenumber+number%10;
            number/=10;
        }
        System.out.println("Reverse number : "+reversenumber);
    }
}
