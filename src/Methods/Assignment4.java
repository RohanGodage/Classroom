package Methods;

import java.util.Scanner;

public class Assignment4 {
    int  sum(int num1,int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;

        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER NUM1");
        num1= sc.nextInt();
        System.out.println("ENTER NUM2");
        num2 = sc.nextInt();
        Assignment4 assignment4 = new Assignment4();
        int fin=assignment4.sum(num1,num2);
        System.out.println("Sum :"+fin);
        }

    }

