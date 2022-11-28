package Random;

import java.util.Objects;

public class equals {
    public equals(int i, String name) {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(true);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public static void main(String[] args) {

        equals equal1= new equals(1,"abc");
        equals equal2= new equals(1,"abc");
        int num1 = equal1.hashCode();
        int num2 = equal2.hashCode();
        //System.out.println(equal1==equal2);
        //System.out.println(equal1.equals(equal1));
        //System.out.println(1170794006==num1);
        //to binary number
        //System.out.println(Integer.toBinaryString(10));
        //to octal number
        //System.out.println(Integer.toOctalString(10));
        //to hexadecimal
        //System.out.println(Integer.toHexString(10));
        //get class
        //System.out.println(equal1.getClass());
        //System.out.println(equal2.getClass());
        //System.out.println(equal1.toString());
        //System.out.println(equal2.toString());
        //System.out.println(num1);
        //System.out.println(num2);
        System.out.println(Objects.equals(equal1,equal1));
    }
}
