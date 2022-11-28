package Random;

import java.util.Scanner;

public class factorsOfNUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();

        for(int i =1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        sc.close();

    }
}
