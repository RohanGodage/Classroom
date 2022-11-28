package Random;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class DistTwoPoint {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1");
        x1= sc.nextInt();
        System.out.println("enter y1");
        y1= sc.nextInt();

        System.out.println("enter x2");
        x2= sc.nextInt();

        System.out.println("enter y2");
        y2= sc.nextInt();

        double distance= Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));

        System.out.println(distance);
    }
}
