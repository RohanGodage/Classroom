package Operators;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number>0)
        {
            sum= sum+number%10;
            number/=10;
        }
        System.out.println(sum);
    }
}
