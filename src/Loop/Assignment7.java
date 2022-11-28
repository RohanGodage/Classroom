package Loop;

import java.util.Scanner;

public class Assignment7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        for (int i = number; i > 0 ; i--) {
            if(number==1){
                System.out.println(number);
            }
            else {
                System.out.print(number + "*");
            }
            number--;
        }
        System.out.println();
    }
}

