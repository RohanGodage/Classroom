package Operators;

import java.util.Scanner;

public class Assignment13 {
        int sum (int number)
        {
            int firstDigit = 0 ;
            int numbercopy = number;
            while (numbercopy>999) {
                firstDigit = numbercopy % 10;
                // firstDigit = numbercopy%=10;
                numbercopy/=10;
            }
            int lastDigit = 0 ;
            while (number>0)
            {
                lastDigit = number%10;
                number/=10;
            }
           int sum = firstDigit + lastDigit;
            return sum;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number =  scanner.nextInt();
        Assignment13 assignment13 = new Assignment13();
        System.out.println("Sum of the first and the second last digit  : "+assignment13.sum(number));
    }
}
