package Operators;

public class Assignment10 {
    void FirstType(int a ,int b )
    {
        int temp = a;
        a=b;
        b=temp;
        System.out.println("By using third variable, value of a : "+ a);
        System.out.println("By using third variable, value of b : "+ b);
    }
    void secondType(int a,int b )
    {
        if(a>b) {
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println(a);
            System.out.println(b);

        } else if (b>a) {
            b= b + a;
            a = b - a;
            b = b - a;
            System.out.println("a : "+ a);
            System.out.println("b : "+b);
        }
        else {
            System.out.println("Both no are equal !!");
        }
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        Assignment10 assignment10 = new Assignment10();
        assignment10.FirstType(a,b);
        assignment10.secondType(a,b);
    }
}
