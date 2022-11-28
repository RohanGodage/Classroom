package Array;

public class Assignment12
{
    public static void main(String[] args) {
        int[] array = {13,42,54,234,654,65,123,34,6,3,90};
        System.out.println(secondMaxElement(array));
    }
    private static int secondMaxElement(int [] array)
    {
        // int [] array = {23,45,76,67,43,21,12,9};

        int max = Integer.MIN_VALUE;
        int secondmax = max;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                secondmax = max;
                max = array[i];
            } else if (array[i] < max && array[i] < secondmax)
            {
                secondmax = array[i];

            }

        }
        //System.out.println(max);
        // System.out.println(secondmax);
        return secondmax;
    }

}
