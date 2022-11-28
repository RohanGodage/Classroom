package StringWithCollection;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Assignment8 {
    public static void main(String[] args) {
        String str = " A big fat ugly toad is not always that much ugly inside";
        System.out.println(str.getBytes(StandardCharsets.UTF_8)+"standard charsets utf 8");
        System.out.println(str.getBytes()+"getbytesway1");
        System.out.println(str.getBytes()+"getbytesway2");
        System.out.println(str.getBytes()+"getbytesway3");
        System.out.println(str.toLowerCase(Locale.ROOT)+"lowercase");
        System.out.println(str.toUpperCase(Locale.ROOT)+"uppercase");
        int ch =  3;
        System.out.println(str.indexOf( ch)+"index of int");
        System.out.println(str.indexOf("toad")+"index of str");
        System.out.println(str.split(" ",2)+"split");
        System.out.println(str.strip()+"strip");
        System.out.println(str.hashCode()+"hashcode");
        String  hashstring = String.valueOf(str.hashCode());
        System.out.println(str.toString()+"tostring");





    }
}
