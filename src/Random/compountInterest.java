package Random;

import java.util.Scanner;

public class compountInterest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amt : ");
        int principle = sc.nextInt();
        System.out.println("Enter Rate of interest : ");
        double ROI = sc.nextDouble();
        System.out.println("Enter no of yrs : ");
        int n= sc.nextInt();

        double ROI1 = ((ROI)/100) + 1;
        double ROI2 = Math.pow(ROI1, n);
        double CI = ROI2 * principle;
        System.out.println(CI);
    }
}
