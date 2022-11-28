package ClassAndObject;

import java.util.Scanner;

public class Assignment6 {

        int length;
        int breadth;

        public Assignment6() {
            this.length = length;
            this.breadth = breadth;
        }
        int returnArea(int length,int breadth){
            int area = length*breadth;
            return area;
        }

        public static void main(String[] args) {
            Assignment6 assignment6 =  new Assignment6();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length : ");
            assignment6.length = sc.nextInt();
            System.out.println("Enter breadth : ");
            assignment6.breadth = sc.nextInt();
            System.out.println(assignment6.returnArea(assignment6.length,assignment6.breadth));



        }

}
