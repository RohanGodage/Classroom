package Loop;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int sum = 0;
        int count =0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter input : ");
            int user = sc.nextInt();
            sum+=user;
            count++;
        }
        int average = sum/count;
        System.out.println("AVERAGE : "+average);
    }
}
