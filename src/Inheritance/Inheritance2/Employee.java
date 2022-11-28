package Inheritance.Inheritance2;

public class Employee {
    int hrs;
    int rate;

    public Employee(int hrs, int rate) {
        this.hrs = hrs;
        this.rate = rate;
    }

    int Salary;
    int computeSalary(int hrs,int rate){
        int salary = hrs * rate;
        System.out.println("salary : "+salary);
        return Salary;
    }
}
