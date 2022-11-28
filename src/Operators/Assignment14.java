package Operators;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number(four digit) : ");
        int number = sc.nextInt();
        int modNum = 0;

        while(number>0) {
            if (number == 0) {

            }
            else
            {
              modNum =   (10*modNum+(number % 10));
                number /= 10;
            }
        }
        int modNumMod =0;
        while (modNum>0)
        {
            int add = modNum%10+2;
            int temp=add;
            int count = 0;
            while(add!=0)
            {
                add=add%10;
                count++;
                add/=10;
            }
            if(count>1)
            {
                temp/=10;
            }
            modNumMod = 10*modNumMod+temp;
            modNum/=10;
        }
        System.out.println(modNumMod);
    }
}
