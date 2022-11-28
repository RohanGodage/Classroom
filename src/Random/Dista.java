package Random;

public class Dista {
    public static void main(String[] args) {
        int [] array1 = {200,6,36,612,121,66,63,39,661,106,-1};
        int [] solution = new int[array1.length];
        int j =0;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i]<100 && array1[i]>=0)
            {
                solution[j]+=array1[i];
                j++;

            }
            else {
                solution[j] = array1[i];
            }
        }
    }
}
