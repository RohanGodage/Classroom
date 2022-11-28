package Loop;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        int sum = 0;
        while(number>0)
        {
            int digit = number%10;
            sum+=digit;
            number/=10;
        }
        System.out.println("Sum : "+sum);
    }

}
