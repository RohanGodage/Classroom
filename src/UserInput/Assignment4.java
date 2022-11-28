package UserInput;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.next();
        System.out.println("Enter roll_no : ");
        int rollNo = sc.nextInt();
        System.out.println("Enter field of interest : ");
        String fieldOfInterest = sc.next();
        System.out.println("Hey,my name is "+name+" and my roll number is "+rollNo +". My field of interest are "+ fieldOfInterest+".");
    }
}
