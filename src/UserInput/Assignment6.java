package UserInput;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        double square = Math.pow(num1,2);
        System.out.println("Square of giiven number : "+square);
    }
}
