package Loop;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();

        int greater = (num1>num2)?num1:num2;
        int gcd =1;
        for (int i = 2; i <greater; i++) {
            if (num1%i==0 && num2%i==0)
            {
                gcd = i;
            }
        }
        System.out.println(gcd);

    }
}
