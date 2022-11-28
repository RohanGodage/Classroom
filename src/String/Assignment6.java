package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment6 {
    public static void main(String[] args) {
        String s1 = "a b cdefabcdefpuiueoqu";
        List list = new ArrayList();
        list.add(Arrays.asList(s1));
        for (int i = 0; i < list.toArray().length ; i++) {
            for (int j = 0; j < list.toArray().length; j++) {
                list.remove(Arrays.asList(list));
            }
        }

        System.out.println(list);
    }
}
