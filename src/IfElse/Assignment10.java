package IfElse;

public class Assignment10 {
    public static void main(String[] args) {
        int x =2;
        int y = 5;
        int z= 0;
        boolean exp1 = (x==2);
        boolean exp2 = (x!=5);
        boolean exp3 = (x!=5 &&  y>=5);
        boolean exp4 = (z!=0 || x ==2);
        boolean exp5 = !(y < 10);

        if(exp1==true)
        {
            System.out.println("Experience 1 is true");
        }
        else if (exp1 == false) {
            System.out.println("Experience 1 is not true");
        }

        if(exp2==true)
        {
            System.out.println("Experience 2 is true");
        }
        else if (exp2 == false) {
            System.out.println("Experience 2 is not true");
        }
        if(exp3==true)
        {
            System.out.println("Experience 3 is true");
        }
        else if (exp3 == false) {
            System.out.println("Experience 3 is not true");
        }
        if(exp4==true)
        {
            System.out.println("Experience 4 is true");
        }
        else if (exp4 == false) {
            System.out.println("Experience 4 is not true");
        }
        if(exp5==true)
        {
            System.out.println("Experience 5 is true");
        }
        else if (exp5 == false) {
            System.out.println("Experience 5 is not true");
        }

    }
}
