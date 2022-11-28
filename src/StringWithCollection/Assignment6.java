package StringWithCollection;

import java.util.HashMap;

public class Assignment6 {
    public static void main(String[] args) {
        String str = " A man with a positive positive approach and direction always looks attractive , but a man with lost direction direction doesn't";
       String [] arrayString = str.trim().split(" ");
        HashMap<String,Integer> stringIntegerHashMap = new HashMap<>();
        for (String word : arrayString) {
            if (stringIntegerHashMap.containsKey(word) || stringIntegerHashMap.containsKey(" ")) {
                stringIntegerHashMap.put(word, stringIntegerHashMap.remove(word));
            } else {
                stringIntegerHashMap.put(word, 1);
            }
        }


        System.out.println(stringIntegerHashMap.keySet());
    }
}
