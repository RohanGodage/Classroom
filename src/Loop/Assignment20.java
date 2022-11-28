package Loop;

import java.util.Scanner;

public class Assignment20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number : ");
        int number = sc.nextInt();
        if(number<0)
        {
            System.out.println("Enter positive integer !!!");
        }
        else
        {
            for (int i = 1; i <= number; i++)
            {
                System.out.println(number+" * "+i+" = "+ number*i);
            }
        }

    }
}
