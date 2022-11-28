package UserInput;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square : ");
        double side = sc.nextDouble();
        double area = Math.pow(side,2);
        double perimeter = 4*side;
        System.out.println("Area : "+area);
        System.out.println("Perimeter : "+perimeter);
    }
}
