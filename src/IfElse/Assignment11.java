package IfElse;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        if(year %100==0 && (year % 4==0 ))
        {
            System.out.println("It's a leap year.");
        }

        else if(year % 100 !=0 && year % 4 ==0)
        {
            System.out.println(" It's a leap year.");
        }
        else
        {
            System.out.println("It's not a leap year.");
        }
        {

        }
    }
}
