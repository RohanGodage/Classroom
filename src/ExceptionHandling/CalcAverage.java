package ExceptionHandling;

import java.util.Scanner;

public class CalcAverage {
    public double avgFirstN(int N) throws Exception {
        if(N<0) {
            Exception IllegalArgumentException = new Exception();
            throw  IllegalArgumentException ;
        }
        int count = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum+=i;
        }
            double average = sum / count;

            return average;
        }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int N = sc.nextInt();
        CalcAverage calcAverage = new CalcAverage();

        double average = calcAverage.avgFirstN(N);
        System.out.println(average);
    }

}
