package Methods;

import java.util.Scanner;

public class Assignment15 {

    double tax;
    double taxable;

    public Assignment15(double taxable) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary : ");
        double salary = sc.nextInt();
        System.out.println("Enter savings : ");
        double savings = sc.nextDouble();
        double taxable = salary-savings;
        Assignment15 assignment15 = new Assignment15(taxable);
        assignment15.taxCalculator(taxable,savings);
    }
    void taxCalculator(double taxable, double savings)
    {
        if (taxable <= 100000) {
            System.out.println("Taxable income lesser than 100000 !");
        }
        else if (taxable > 100000 && taxable <= 200000)
        {
            this.tax = (int) (0.01 * taxable);
            System.out.println("TAX : "+tax);
            System.out.println("Taxable income greater than 100000 and lesser than 200000 ="+taxable);
        } else if (taxable > 200000 && taxable <= 500000)
        {
            this.tax = (int) (0.02 * taxable);
            System.out.println("TAX : "+tax);
            System.out.println("Taxable income greater than 200000 lesser than 500000 ="+taxable);
        }
        else if (savings > 500000)
        {
            this.tax = (int) (0.03*taxable);
            System.out.println("TAX : "+tax);
            System.out.println("Salary greater than 500000"+taxable);
        }

    }

}
