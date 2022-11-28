package IfElse;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of classes held : ");
        double noOfClassesHeld = sc.nextDouble();
        System.out.println("Enter number of classes attended : ");
        double noOfClassesAttended = sc.nextDouble();
        double percentageofClassesattended = (noOfClassesAttended / noOfClassesHeld) * 100;
        boolean isAllowed;

        if (percentageofClassesattended >= 75) {
            isAllowed = true;
        } else {
            isAllowed = false;
        }
        System.out.println("Percentage : "+ percentageofClassesattended+"%");
        if (isAllowed == true) {
            System.out.println("Can attend exam");
        } else {
            System.out.println("Can not attend exam");
        }
    }
}