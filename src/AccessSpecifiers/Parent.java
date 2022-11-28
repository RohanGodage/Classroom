package AccessSpecifiers;

public class Parent {
    void m1()
    {
        System.out.println("default method");
    }
    public void m2()
    {
        System.out.println("public method");
    }
    protected  void m3()
    {
        System.out.println("protected method");
    }
    private  void m4()
    {
        System.out.println("private method"+" : Only class");

    }


}
