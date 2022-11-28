package Array;

public class ArraycopySandeepSir
{
    public static void main(String[] args)
    {
        int[] array1 = {12, 45, 32, 21, 56, 87};
        //  int [] array2 = array1;new array not created;second array is pointing to array 1
        int[] array2 = createArrayCopy(array1);
        for (int temp : array2)
        {
            System.out.println(temp);
        }
        System.out.println("REVERSE ARRAY");
        int[] arrayReverse = new int[array1.length];
        arrayReverse = createreverseArray(array1);
        for (int temp : arrayReverse)
        {
            System.out.println("reverse array : " + temp);
        }
    }

    private static int[] createArrayCopy(int[] array1)
    {
        if (array1 == null) return new int[0];
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++)
        {
            result[i] = array1[i];

        }
        return result;
    }

    private static int[] createreverseArray(int[] array1)
    {
        int[] result2 = new int[array1.length];
        for (int j = array1.length-1; j > 0; j--)
        {


            result2[j] = array1[j];
        }
        return result2;
    }
}
