package Loop;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input as fraction (a/b) : ");
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();
        int smallest = (numerator<denominator)?numerator:denominator;
        int i =smallest;
        while( numerator % i == 0 && denominator % i == 0)
        {
                numerator = numerator / i;
                denominator = denominator / i;
                i--;

        }
        System.out.println("numerator"+numerator);
        System.out.println("denominator"+denominator);
    }
}
