package ClassAndObject;

import java.util.Scanner;

public class Assignment7
{
    int a ;
    int b ;
    int c ;
    int calculateaverage(int a,int b,int c){
        int average = (a+b+c)/3;
        return average;
    }

    public static void main(String[] args) {
        Assignment7 assignment7 =  new Assignment7();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first");
        int a = sc.nextInt();
        System.out.println("enter second");
        int b = sc.nextInt();
        System.out.println("enter third");
        int c = sc.nextInt();
        System.out.println("Final average  : "+assignment7.calculateaverage(a,b,c));
    }
}
