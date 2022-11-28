package UserInput;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first input : ");
        String s1 = sc.next();
        System.out.println("Enter second input : ");
        String s2 = sc.next();
        System.out.println("Enter third input : ");
        String s3 = sc.next();
        if(s1.equals(s2) && s2.equals(s3))
        {
            System.out.println("All are equal.");
        }
        else if (s1.equals(s2) || s2.equals(s3))
        {
            System.out.println("Any of two are equal.");
        }
    }
}
