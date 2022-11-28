package ClassAndObject;

import java.util.Scanner;


public class Assignment8 {
    int sumreal;
    int sumimaginary;

     String sum(int a1, int b1,int a2,int b2){

        int sumreal = a1+a2;
        int sumimaginary = b1+b2;
        String finalsum= "Final Sum : "+sumreal+""+"+"+sumimaginary+"i";
        System.out.println();
        return finalsum;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number's real part  : ");
        int a1 =sc.nextInt();
        System.out.println("Enter first number's imaginary part  : ");
        int b1 = sc.nextInt();
        System.out.println("Enter second number's real part  : ");
        int a2 =sc.nextInt();
        System.out.println("Enter second number's imaginary part  : ");
        int b2 = sc.nextInt();
        Assignment8 assignment8 = new Assignment8();
        System.out.println(assignment8.sum(a1,b1,a2,b2));
    }

}
