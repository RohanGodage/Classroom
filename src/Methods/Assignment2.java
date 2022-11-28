package Methods;

import java.util.Scanner;

public class Assignment2 {
    boolean flag;
    int num;

    public Assignment2(boolean flag, int num) {
        this.flag = flag;
        this.num = num;
    }

    public Assignment2() {

    }

    boolean evenOdd(int num){
        if(num%2==0){
            flag = true;

            return true;
        }else {


            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");

        Assignment2 assignment2 = new Assignment2();
        boolean flag = assignment2.evenOdd(assignment2.num);
        if(flag==true){
            System.out.println("Even no!!");
        }
        else if(flag==false){
            System.out.println("Odd no!!");
        }
    }
}
