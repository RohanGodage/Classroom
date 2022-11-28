package Random;

public class string {
    public static void main(String[] args) {
        String str1 = new String("   Abc def gHi");
        System.out.println(str1.trim());

        String str = "Astring handling is a easy topic";
        str = str.replace('a','@');
        System.out.println(str);
        str = str.replace("e@sy","h@rd");
        System.out.println(str);
        System.out.println(str.charAt(5));
        System.out.println(str.codePointAt(0));
        System.out.println(str.isEmpty());
        System.out.println(str.startsWith("A"));
        System.out.println(str.endsWith("topic"));
        char[] chars = str.toCharArray();
        String str2 = new String(new char[]{'A','B'});
    }
}