package Random;

import java.util.Scanner;

public class averageofN {
    public static void main(String[] args) {
        System.out.println("Enter number count");
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count = sc.nextInt();
        for(int i =1;i<=count;i++){
            int num = sc.nextInt();
            sum+=num;

        }
        System.out.println(sum/count);
    }
}
