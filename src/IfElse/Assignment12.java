package IfElse;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter age : ");
        int age = sc.nextInt();
        System.out.println("Enter gender (M or F) : ");
        String gender = sc.next();
        System.out.println("Enter marital status (Y or N) : ");
        String marital = sc.next();
        if (gender == "F")
        {
            System.out.println(" She will work in urban areas.");
        }
        else if (gender == "M" && (age >20 && age < 40)){
            System.out.println("He may work anywhere.");
        }
        else if (gender == "M" && (age >40 && age < 60))
        {
            System.out.println( " He will work in urban areas. ");
        }
        else {
            System.out.println(" Error" +
                    " ");
        }
    }
}
