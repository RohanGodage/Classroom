package Random;

import java.util.Scanner;
public class largestno {
    public static void main(String[] args) {
        int num=1 ;
        int largest=0;
        Scanner sc =new Scanner(System.in);


        while(num!=0) {
            System.out.println("Enter number  : ");
            num = sc.nextInt();
            if(largest<num)
            {
                largest=num;
            }
        }
        System.out.println("largest"+largest);
    }}
