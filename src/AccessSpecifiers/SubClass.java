package AccessSpecifiers;

public class SubClass extends Parent
{
    public static void main(String[] args)
    {
        SubClass subClass = new SubClass();
        subClass.m1();
        subClass.m2();
        subClass.m3();
        System.out.println();
        Parent parent =  new Parent();
       parent.m1();
       parent.m2();
       parent.m3();
        System.out.println();
       Parent parent1 = new SubClass();
       parent1.m1();
       parent1.m2();
       parent1.m3();



    }
}
