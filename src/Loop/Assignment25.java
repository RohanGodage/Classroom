package Loop;

import java.util.Scanner;

public class Assignment25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1  = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        int a,b;
       if(num1>num2)
       {
           a=num1;
           b=num2;
       }
       else {
           a=num2;
           b=num1;
       }
        int quotient = 0;
        while(a>=b)
        {
            a-=b;
            quotient++;

        }
        System.out.println("Quotient : "+quotient);
        System.out.println("Remaninder : "+a);
    }
}
