package Random;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num ");
        num = sc.nextInt();
        int factorial=1;
        String factorial1=" ";
        for (int i = 1; i<=num ; i++) {

            factorial*=i;
            factorial1+="*"+i;

        }
        System.out.println(factorial);
        System.out.println(factorial1);
    }
}
