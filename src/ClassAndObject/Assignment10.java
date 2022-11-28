package ClassAndObject;

import java.util.Scanner;

public class Assignment10 {

    float AddDistance(float inch1 , float feet1,float inch2,float feet2){
        float Inch=inch1+inch2;
        float Feet=feet1+feet2;
        float finalAdd = Feet+Inch/12;
        return finalAdd;

    }

    public static void main(String[] args) {
        Assignment10 assignment10 =  new Assignment10();
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter first distance  feet : ");
        float feet1= sc.nextInt();

        System.out.println("Enter frst distance inch : ");
        float inch1 = sc.nextInt();
        System.out.println("Enter second distance  feet : ");
        float feet2= sc.nextInt();

        System.out.println("Enter second distance inch : ");
        float inch2 = sc.nextInt();

        System.out.println("Added Distance : "+assignment10.AddDistance( inch1,feet1,inch2,feet2)+"in feets.");
    }

}
