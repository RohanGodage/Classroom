package Loop;

import java.util.Scanner;

public class Assignment23 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter  element : ");
            int userInput = sc.nextInt();
            if(userInput%2==0)
            {
                sum += userInput;
            }
        }
        System.out.println("Sum : "+sum);
    }
}
