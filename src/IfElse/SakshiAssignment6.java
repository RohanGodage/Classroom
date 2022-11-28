package IfElse;
import java.util.Scanner;

public class SakshiAssignment6 {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the age : ");
        int age= scanner.nextInt();
        System.out.println("Enter gender(M or F) : ");
        String gender= scanner.next();
        System.out.println("Enter marital status(Y or N ) :  ");
        String marital= scanner.next();

        if (gender.contentEquals("F"))
        {
            System.out.println(" She will work in urban areas.");
        }
        else if (gender.contentEquals("M") && (age >=20 && age <= 40)){
            System.out.println("He may work anywhere.");
        }
        else if (gender.contentEquals("M") && (age >40 && age <= 60))
        {
            System.out.println( " He will work in urban areas. ");
        }
        else {
            System.out.println(" Error ");
        }

    }
}