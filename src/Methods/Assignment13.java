package Methods;

import java.util.Scanner;

public class Assignment13 {
    int result;
    int num;

    public Assignment13(int num, int result) {
        this.result = result;
        this.num = num;
    }

    int perfect(int num){
        for(int i =1;i<num;i++){
            if(num%i==0){
                result=result+i;
                System.out.println(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Perfect Number ");
        System.out.println("Enter num : ");
        int num = sc.nextInt();
        Assignment13 assignment13 = new Assignment13(num,result);

        int finalresult=assignment13.perfect(num);

        System.out.println(finalresult);
        if(finalresult==num)
        {
            System.out.println("Perfect Number !!");

        }
        else {
            System.out.println("Not a perfect number !!");
        }


}
}
