package IfElse;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value : ");
        int a = sc.nextInt();
        System.out.println("Enter second value : ");
        int b = sc.nextInt();
        System.out.println("greater value is : "+(a>b?a:b));
    }
}
