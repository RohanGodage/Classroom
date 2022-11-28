package Methods;

import java.util.Scanner;

public class Assignment5 {
    int  product(int num1,int num2) {
        int product = num1 * num2;
        return product;
    }
    public static void main(String[] args) {
        int num1;
        int num2;
        int product;

        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER NUM1");
        num1= sc.nextInt();
        System.out.println("ENTER NUM2");
        num2 = sc.nextInt();
        Assignment5 assignment5 = new Assignment5();
        int fin=assignment5.product(num1,num2);
        System.out.println("Product :"+fin);
    }

}

