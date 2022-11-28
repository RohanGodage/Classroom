package Loop;

import java.util.Scanner;

public class Assignment24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter second number : ");
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum+=b;
        }
        System.out.println("Sum : "+sum);
    }
}
