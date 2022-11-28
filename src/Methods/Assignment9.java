package Methods;

import java.util.Scanner;




public class Assignment9 {
    int num;
String output = "1";
    public Assignment9(int num) {
        this.num = num;
    }

    void factorial(int num) {
        for (int i = 1; i <this.num; i++) {
            num*=i;
            output += "*"+i;


        }
        System.out.println(num+"is the value of num Random.factorial");
        System.out.println(output+"is the output string ");
    }
    public static void main(String [] args){
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        num= sc.nextInt();

        Assignment9 assignment9 = new Assignment9(num);
        assignment9.factorial(num);
    }
}
