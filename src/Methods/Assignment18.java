package Methods;

import java.util.Scanner;

public class Assignment18 {
    int length;
    int breadth;

    public Assignment18(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Assignment18() {

    }

    int area(int length) {
        int area = length * length;
        return area;
    }
        int area(int length,int breadth)
        {
            int area = length * breadth;
            return area;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square : ");
        int side = sc.nextInt();
        System.out.println("Enter length : ");
        int length = sc.nextInt();
        System.out.println("Enter breadth :");
        int breadth = sc.nextInt();
        Assignment18 assignment18= new Assignment18();
        int squarearea = assignment18.area(side);
        int rectanglearea = assignment18.area(length,breadth);
        System.out.println("Square area : "+squarearea+"cm^2");
        System.out.println("Rectangle area : "+rectanglearea+"cm^2");

    }

}
