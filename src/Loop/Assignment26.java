package Loop;

import java.util.Scanner;

public class Assignment26 {
//   static int isPerfect(int number) {
//        boolean bool = false;
//        int sum =0;
//        for (int i = 1; i < number; i++) {
//
//            if (number % i == 0)
//            {
//                sum += i;
//            }
//
//            if (number == sum)
//            {
//
//               return number;
//            }
//        }
//        return number;
//    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int sum =0;
        for (int i = 0; i < 1000; i++) {
            sum=0;
            for (int j = 1; j < i; j++) {
                if (i%j==0)
                {
                    sum+=j;
                }
            }
            if (sum==i )
            {
                System.out.println(i);
            }
        }


    }
}
