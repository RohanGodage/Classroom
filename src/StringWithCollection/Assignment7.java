package StringWithCollection;

public class Assignment7 {
    public static  String rev(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        String str = " amalgam";
        String reverse="";
        System.out.println("First way (.charAt())");
        for (int i = str.length()-1; i > 0 ; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        String second = "Delhi";
        System.out.println(" Second way ");

        second = rev(second);
        System.out.println(second);

    }
}
