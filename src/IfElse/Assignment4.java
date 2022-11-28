package IfElse;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter salary : ");
        double salary = scanner.nextInt();
        System.out.println("Enter no of years : ");
        int NoOfYears = scanner.nextInt();
        double newSalary ;
        if (NoOfYears > 5)
        {
            newSalary =  (150 * salary)/100;
        }
        else
        {
            newSalary=salary;
        }
        System.out.println("New bonus amount : "+newSalary);
    }
}
