package ClassAndObject;

import java.util.Scanner;

public class Assignment4 {
    static int side1;
    static int side2;
    static int side3;
    static int s;
    public Assignment4(int side1, int side2, int side3,int s) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    int area(int side1,int side2,int side3,int s){
        double area = Math.sqrt((s-side1)*(s-side2)*(s-side3));
        System.out.println(area);
        return (int) area;
    }

    public static void main(String[] args) {

        Assignment4 assignment4 = new Assignment4(3,4,5,s);
        int s= (side1+side2+side3)/2;
        assignment4.area(side1,side2,side3,s);


    }
}
