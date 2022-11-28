package Methods;

import java.util.Scanner;

public class Assignment1 {
    int min(int num,int min) {

        if (num < min) {
            min = num;
        }
        return min;
    }

    int max(int num,int max) {

        if (max < num) {
            max = num;

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 no :");
        int num = sc.nextInt();
        int min = num;
        int max= num;


        Assignment1 assignment1 = new Assignment1();
        for (int i = 2; i <= 3; i++)
        {
            System.out.println("Enter "+i+"  no : ");

            num = sc.nextInt();
            assignment1.min(num,min);
            assignment1.max(num,max);





        }

        System.out.println("Min : " + assignment1.min(num,min));
        System.out.println("Max : " + assignment1.max(num,max));

    }
}
