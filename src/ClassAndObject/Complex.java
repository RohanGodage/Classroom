package ClassAndObject;

import java.util.Scanner;

public class Complex {
    void sum (int real1,int real2,int imag1,int imag2){
        int sumr = real1+real2;
        int sumi = imag1+imag2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real value of first no : ");
        int real1 = sc.nextInt();
        System.out.println("Enter imaginary value of first no : ");
        int imag1 = sc.nextInt();
        System.out.println("Enter real value of first no : ");
        int real2 = sc.nextInt();
        System.out.println("Enter imaginary value of first no : ");
        int imag2 = sc.nextInt();
        Complex complex = new Complex();
        complex.sum(real1,real2,imag1,imag2);

    }
}
