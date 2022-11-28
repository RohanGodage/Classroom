package Loop;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        int sumeven= 0;
        int sumodd= 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        while (number>0)
        {
            int digit = number%10;
            if (digit%2==0)
            {
               sumeven= sumeven+number%10;
            }
            else
            {
                sumodd = sumodd + number%10;
            }
            number/=10;
        }
        System.out.println("Sum even : "+sumeven);
        System.out.println("Sum odd : "+sumodd);
    }
}
