package Loop;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice="";
        int average = 0;
        int product =1;
        int count = 0;
        int sum = 0;
        while (!choice.equals("q"))
        {
            System.out.println("Enter number : ");
            choice = scanner.next();


            if(!choice.equals("q")) {
                int number = Integer.parseInt(choice);
                product= product *number;
                sum = sum + number;

                count++;
            }

        }
        average= sum/count;
        System.out.println("Product is : "+product +"and average is : "+average);
    }
}
