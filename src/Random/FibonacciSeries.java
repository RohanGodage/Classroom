package Random;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int c;
        System.out.println("Enter no of times you want to print :");
        int times = sc.nextInt();
        System.out.println(a);

        System.out.println(b);
        for(int i =1;i<=times;i++){

            c=a+b;
            a=b;
            b=c;
            System.out.println(c);

        }
    }
}
