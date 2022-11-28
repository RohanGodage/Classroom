package StringWithCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Assignment1
{
    public static void main(String[] args)
    {
        String str = "alpha beta gamma gamma beta alpha beta alpha";
        final String[] finalstr = str.split(" ");
        System.out.println(finalstr);
        final Map<String , Integer> HashmapOfString = new HashMap<>();
        for (String word : finalstr) {
            if (HashmapOfString.containsKey(word))
            {
                HashmapOfString.put(word,HashmapOfString.get(word)+1);
            }
            else
            {
                    HashmapOfString.put(word,1);
            }
        }
        final Set <String> wordsinString = HashmapOfString.keySet();
        for (String strfinal : wordsinString) {
            if (HashmapOfString.get(strfinal)>1)
            {
                System.out.println(strfinal+HashmapOfString.put(strfinal , + HashmapOfString.get(strfinal)+1));
            }

        }
    }
}
