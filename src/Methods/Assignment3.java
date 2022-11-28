package Methods;

import java.util.Scanner;

public class Assignment3 {
    int age;
    String isEligible(int age){
        if(age>=18){
            System.out.println("Eligible to vote !!");
        }
        else{
            System.out.println("Not ELigible to vote");
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt();
        Assignment3 assignment3 = new Assignment3();

        System.out.println(assignment3.isEligible(age));

    }
}
