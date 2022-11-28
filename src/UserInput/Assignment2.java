package UserInput;

import java.util.Scanner;

public class Assignment2 {
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
        int result1=sum;
        int result2=product;
        int resultSum=result1+result2;
        int resultProduct=result1*result2;
        System.out.println("Result sum : "+resultSum);
        System.out.println("Result product : "+resultProduct);
    }
}
