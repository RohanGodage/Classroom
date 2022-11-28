package Methods;

import java.util.Scanner;

public class Assignment12 {

    int num ;
    int result=0;

    public Assignment12(int num)
    {
        this.num = num;
    }

    int fibonacci(int num)
    {
        int result = fibonacci(num-1);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci");
        System.out.println("Enter num : ");
        int num = sc.nextInt();
        Assignment12 assignment12 =new Assignment12(num);
        assignment12.fibonacci(num);

    }
}
