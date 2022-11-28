package Loop;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        int check = number;
        int sum = 0;
        while(number>0)
        {
            int digit= (int) Math.pow(number%10,3);
            sum+=digit;
            number/=10;

        }
        System.out.println(sum);
        if(sum==check)
        {
            System.out.println("Armstrong number !!");
        }
        else {
            System.out.println("Not a armstrong number.");
        }


    }
}
