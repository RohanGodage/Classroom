package ClassAndObject;

import javax.print.attribute.HashPrintServiceAttributeSet;
import java.util.Scanner;

public class Assignment1 {
    int length1;
    int breadth1;
        public void setDim(int length,int breadth)
        {
            this.length1=length;
            this.breadth1 = breadth;
        }
        public int getDim(){
            int area = this.length1*this.breadth1;
            System.out.println(area);
            return area;

        }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length");

        int length = sc.nextInt();

        System.out.println("Enter breadth");
        int breadth = sc.nextInt();

        Assignment1 assignment1 = new Assignment1();
        assignment1.setDim(length,breadth);

        assignment1.getDim();



    }
}
