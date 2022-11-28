package ClassAndObject;
import java.util.Scanner;
public class Assignment3 {
    double side1;
    double side2;
    double side3;
     double length;
     double breadth;

    double perimeter(double side1,double side2,double side3){
        System.out.print("addition"+(side1+side2+side3));
        return side1+side2+side3;
    }
    double area(double length,double breadth){
        System.out.print("addition"+((length*breadth)/2));
        return (length*breadth)/2;
    }
    public static void main(String[] args) {
        Assignment3 assignment3 = new Assignment3();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter what you want 1)perimeter or 2)area : (enter no 01 or 02 ONLY!!)");
        int input = sc.nextInt();
        if(input==1) {
            System.out.println("Enter side1 : ");
            assignment3.side1 = sc.nextInt();
            System.out.println("Enter side2 : ");
            assignment3.side2 = sc.nextInt();
            System.out.println("Enter side3 : ");
            assignment3.side3 = sc.nextInt();

            assignment3.perimeter(assignment3.side1,assignment3.side2, assignment3.side3);
        }
        else if(input==2){
            System.out.println("Enter length : ");
            assignment3.length = sc.nextInt();
            System.out.println("Enter breadth : ");
            assignment3.breadth = sc.nextInt();
            assignment3.area(assignment3.length,assignment3.breadth);

        }

    }
}
