package UserInput;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int a = sc.nextInt();
        System.out.println("Enter num2");
        int b = sc.nextInt();
        if(a<b && a<50)
        {
            System.out.println("Both conditions satisfied.");
        }
    }
}
