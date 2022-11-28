package IfElse;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of classes held : ");
        double noOfClassesHeld = sc.nextDouble();
        System.out.println("Enter number of classes attended : ");
        double noOfClassesAttended = sc.nextDouble();
        double percentageofClassesattended = (noOfClassesAttended / noOfClassesHeld) * 100;
        boolean isAllowed;
        System.out.println("Enter medical cause (Y or N) :  ");
        boolean ismedical  = sc.hasNext();
        if (percentageofClassesattended >= 75) {
            isAllowed = true;
        } else {
            isAllowed = false;
        }
        System.out.println("Percentage : "+ percentageofClassesattended+"%");
        if (ismedical == true) {
            System.out.println("Can attend exam");
        } else {
            System.out.println("Can not attend exam");
        }
    }
}