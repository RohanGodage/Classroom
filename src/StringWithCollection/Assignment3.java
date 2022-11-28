package StringWithCollection;

import java.util.HashMap;

public class Assignment3 {
    static int occurence(String str, String substr) {
        if (str.contains(substr)) {
            return 1 + occurence(str.replaceFirst(substr, ""), substr);
        }
        return 0;
    }
    public static void main(String[] args) {
        String str = "shore shore She She She She She sells sea shells on the sea shore . Once She sells one shell on one shore and other on other shore";
        String substr = "She";
        //HashMap<String,Integer> hashmap = new HashMap<>();
        String[] finalstr = str.trim().split(" ");
        int count =0 ;
        System.out.println(occurence(str,substr));

//
//        for (String str1 : finalstr) {
//            if (str1==substr)
//            {
//                count++;
//            }
//        }
//        System.out.println("Number of Occurrences of Substring in a String : " + count );

        }


}
