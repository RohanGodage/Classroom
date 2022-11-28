package Loop;

import java.util.Scanner;

public  class Assignment15{
    static boolean bool1= false;
    static boolean isFactor(int j)
    {
        for (int i = 2; i <= j/2; i++) {
            if(j%i==0)
            {
                bool1 =true;
            }
        }
        return bool1;
    }

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        int i = 1;
        for (int j = 2; j <= number/2; j++)
        {
            if (number % j == 0) {

                boolean result = isFactor(j) ;
                if (result == true) {
                    System.out.println("Nil");
                }
                else {
                    System.out.println("Its prime factor are : " + j);
                }

            }
        }
    }
}

