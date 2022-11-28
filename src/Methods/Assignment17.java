package Methods;

public class Assignment17 {
    int num;
    char abc;

    public Assignment17(int num, char abc)
    {
        this.num = num;
        this.abc = abc;
    }

    public Assignment17() {

    }

    void method1(int num, char abc)
    {
        System.out.println("NUM : "+num);
        System.out.println("CHAR : "+abc);
    }

    void method1( char abc,int num)
    {
        System.out.println("CHAR : "+abc);
        System.out.println("NUM : "+num);

    }

    public static void main(String[] args) {
        int num;
        char abc;
        Assignment17 assignment17 = new Assignment17();
        assignment17.method1(15,'A');
        assignment17.method1('B',16);
    }
}
