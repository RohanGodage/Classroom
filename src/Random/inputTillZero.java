package Random;

import java.util.Scanner;
public class inputTillZero {
    public static void main(String[] args) {
        int num=1 ;
        int sum=0 ;
       Scanner sc =new Scanner(System.in);


          while(num!=0) {
              System.out.println("Enter number  : ");
              num = sc.nextInt();
              sum += num;
          }
System.out.println("sum :"+sum);
    }}
