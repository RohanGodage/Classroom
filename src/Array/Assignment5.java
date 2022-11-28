package Array;

public class Assignment5 {
    public static void main(String[] args) {

        int[] array = {5, 3, 1, 2, 4, 6};
        // to remove element 2 and 6
        for (int i = 0; i < array.length; i++)
        {
            if(array[i]==2|| array[i]==6)
            {
                array[i]=0;
            }
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }


    }
}