package Methods;

import java.util.Scanner;

public class Assignment6 {
    double  circumference(int r) {
        double circumference = 2*3.14*r;
        return circumference;
    }
    double  area(int r) {
        double area = r*r;
        return area;
    }
    public static void main(String[] args) {
        int r;

        int circumference;


        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER RADIUS");
        r= sc.nextInt();
        Assignment6 assignment6 = new Assignment6();
        double fin=assignment6.circumference(r);
        System.out.println("Circumference :"+fin);

        System.out.println("Area : "+assignment6.area(r));
    }

}

