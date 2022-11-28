package Methods;

import java.util.Scanner;

public class Assignment14 {
    double a;
    double b ;
    double result;

    public Assignment14(double a, double b, double result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }
    double calculate(double a, double b){
         result = Math.pow(a,b);
         return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number : ");
        double a = sc.nextInt();
        System.out.println("Enter power : ");
        double b = sc.nextInt();
        double result = 0;
        Assignment14 assignment14 = new Assignment14(a,b,result);
        double finall = assignment14.calculate(a,b);
        System.out.println("Final result : "+finall);

    }
}
