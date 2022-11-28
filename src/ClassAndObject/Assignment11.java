package ClassAndObject;

import java.util.Scanner;

public class Assignment11 {
    int salary;
 //
    int noofhrs;

    int getInfo(int salary, int noofhrs) {
        this.salary = salary;
        this.noofhrs = noofhrs;
        return salary;
    }

    int AddSal(int salary)
    {
        if (salary < 500) {
            int increment = 10;

            salary +=increment;

        }

    return salary;
    }
    int AddWork(int noofhrs,int salary){
        if(noofhrs>6){
            int increment = 5;
            salary+=increment;
            return salary;
        }

        return salary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter no of hrs : ");
        int noofhrs = sc.nextInt();
        Assignment11 assignment11=new Assignment11();
        assignment11.AddSal(assignment11.salary);
        System.out.println("Salary Final : "+assignment11.AddWork(assignment11.noofhrs,assignment11.salary));
    }

}
