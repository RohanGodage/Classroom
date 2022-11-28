package ARRAYandStringPractice;

import java.util.Arrays;

public class Assignment1 {
    void array_sort(String[] str, int [] num){
       Arrays.sort(str);
       Arrays.sort(num);

    }
    public static void main(String[] args) {
        String[] str = {"alpha","gamma","beta"};
        int[] num = {1,3,5,7,9,8,6,4,2,0};
        Assignment1 assignment1 = new Assignment1();
        assignment1.array_sort(str,num);
        for (int i =0;i< str.length;i++){
            System.out.println(str[i]+"\n");

        }
        for (int i =0;i< str.length;i++){
            System.out.println(num[i]);

        }
    }
}
