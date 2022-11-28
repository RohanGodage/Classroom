package Methods;

import java.util.Scanner;

public class Assignment11 {
    int num;
    int count;

    public Assignment11(int num) {
        this.num = num;
        this.count = count;
    }
    void prime(int num){
        for(int i =2;i<num;i++){
            if(num%i==0){
                System.out.println(i);
                count++;
            }

        }

        System.out.println("Total "+count+" numbers ");
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num  : ");
        num = sc.nextInt();
        Assignment11 assignment11 = new Assignment11(num);
        assignment11.prime(num);
    }

}
