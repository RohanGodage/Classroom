package UserInput;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        int sum ;
        int product;
        sum=num1+num2;
        product=num1*num2;
        System.out.println("Sum : "+sum);
        System.out.println("Product : "+product);
    }
}
