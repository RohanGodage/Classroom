package Array;

public class Assignment6 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int [] array2 = new int[5];
        for(int i =0;i < array.length ; i++)
        {
            array2[i]=array[i];
        }
        for(int i =0; i < array.length;i++)
        {
            System.out.println(array2[i]);
        }
    }
}
