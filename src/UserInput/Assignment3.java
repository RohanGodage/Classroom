package UserInput;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length (double)");
        double length = sc.nextDouble();
        System.out.println("Enter breadth (double)");
        double breadth = sc.nextDouble();
        int area = (int)(length*breadth);
        System.out.println("Area : "+area);
    }
}
