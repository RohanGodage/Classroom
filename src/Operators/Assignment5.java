package Operators;

public class Assignment5 {
    boolean checkEqual(int a,int b ){
        if(a==b)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int a =45; int b = 23;
        Assignment5 assignment5 = new Assignment5();
        if(assignment5.checkEqual(a,b)==true) {
            System.out.println("Both are equal !!");
        }
        else{
            System.out.println("Not Equal !!");
        }
    }
}
