package IfElse;

import java.util.Scanner;

public class Assignment6 {
    int compare (int a ,int b ,int c)
    {
        int result = 0;
        if(a>b && a > c)
        {
            result=a;
        }
        else if (b>a && b>c) {
            result = b;
        }
        else if(c>a && c > b){
            result = c;
        }

        return  result;
    }
    public static void main(String[] args) {
        Assignment6 assignment6 = new Assignment6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number " );
        int a = sc.nextInt();
        System.out.println("Enter second number " );
        int b = sc.nextInt();
        System.out.println("Enter third number " );
        int c = sc.nextInt();

        System.out.println("The largest among given values is : "+assignment6.compare(a,b,c));
    }
}
