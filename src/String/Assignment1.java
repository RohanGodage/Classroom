package String;

public class Assignment1 {
    public static void main(String[] args) {
        String[] str1 = {"Today","Today"," is"," the always the best day to start.","Today"};
        for (int i = 0; i < str1.length ; i++) {
            for (int j = i+1; j < str1.length; j++) {
                if (str1[i]==(str1[j]))
                {
                    System.out.println("Duplicate word present : "+str1[j]);

            }

        }

        }
    }
}
