package UserInput;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first subject marks : ");
        int marks1 = sc.nextInt();
        System.out.println("Enter first second marks : ");
        int marks2 = sc.nextInt();
        System.out.println("Enter first third marks : ");
        int marks3 = sc.nextInt();
        int totalMarks = marks1+marks2+marks3;
        int percentage = (totalMarks/3);
        System.out.println("Total marks : "+totalMarks);
        System.out.println("Percentage : "+percentage);
    }
}
