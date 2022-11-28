package StringWithCollection;

import java.util.HashMap;

public class Assignment4 {
    public static void main(String[] args) {
        String str = "alpha beta gamma gamma";
        System.out.println(str.split(" "));
        String finalstr = str.trim();
        System.out.println(finalstr);
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < finalstr.length()-1; i++) {
            if (hashMap.containsKey(finalstr.charAt(i)))
            {
                hashMap.put(finalstr.charAt(i),hashMap.get(finalstr.charAt(i)+1));
            }
            else
            {
                hashMap.put(finalstr.charAt(i),1);
            }
        }
        System.out.println(hashMap);
        str.replaceAll("\\s","");
        System.out.println(str);
    }
}
