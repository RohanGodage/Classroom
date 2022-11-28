package Methods;

import java.util.Scanner;

public class Assignment7 {
    int isPrime(int num){
        int count =0;
        for (int i = 1; i <num; i++) {
            if(num%i==0){
                count++;

            }


        }
        return count;
    }
    public static void main(String[] args) {
        int num;

        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER NUM");
        num= sc.nextInt();
        Assignment7 assignment7 = new Assignment7();
        double count=assignment7.isPrime(num);
        if(count>=2)
        {

            System.out.println("Not Prime !!");
        }
        else {
            System.out.println(" Prime !!");
        }
    }

}

