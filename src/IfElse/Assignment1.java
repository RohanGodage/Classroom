package IfElse;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int length = sc.nextInt();
        System.out.println("Enter breadth : ");
        int breadth = sc.nextInt();
        if(length == breadth)
        {
            System.out.println("It is a square.");
        }
        else {
            System.out.println("It is not a square.");
        }
    }
}
