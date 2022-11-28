package IfElse;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity : ");
        int quantity = scanner.nextInt();
        double totalQuantity;
        if (quantity>1000)
        {
            totalQuantity = (quantity*100);
            totalQuantity = 0.9*totalQuantity;
            System.out.println("Total quantity : "+totalQuantity);
        }
        else {
            totalQuantity = quantity*100;
            System.out.println("Total quantity : "+totalQuantity);
        }
    }
}
