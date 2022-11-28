package Operators;

public class Assignment2 {
    int perimeterOfTriangle(int side1,int side2,int side3){
        int perimeter  = side1+side2+side3;
        return perimeter;
    }
    public static void main(String[] args) {
       int perimeter  ;
       Assignment2 assignment2 = new Assignment2();
        System.out.println("Perimeter of given values : " + assignment2.perimeterOfTriangle(2,3,5));

    }
}
