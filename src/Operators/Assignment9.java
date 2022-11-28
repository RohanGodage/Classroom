package Operators;

public class Assignment9 {
    int totalMarks (int a,int b ,int c){
        return a+b+c;
    }
    int Percentage (int a, int b,int c)
    {
        return (a+b+c)/2;
    }
    public static void main(String[] args) {
        int marksA = 78;
        int marksB = 45;
        int marksC = 62;
        Assignment9 assignment8 = new Assignment9();
        System.out.println("Total marks : "+ assignment8.totalMarks(marksA,marksB,marksC));
        System.out.println("Percentage : "+assignment8.Percentage(marksA,marksB,marksC));
    }
}
