package Array;

public class Assignment11
{
    boolean arrayEqual (int[] array1,int[] array2) {
        boolean bool = false;
        for (int i = 0; i < array1.length; i++) {
            int j;
            for (j = i; j <= i; j++) {
                //System.out.println(array1[i]);
                //System.out.println("array2[j]" + array2[j]);
                if (array1[i] == array2[j]) {
                    bool = true;
                }
            }
        }
return  bool;
    }
    public static void main(String[] args)
    {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {2,3,4,5,6};
        int [] array3 = {1,2,3,4,5};
        Assignment11 assignment11 = new Assignment11();
        Assignment12 assignment12 = new Assignment12();
        boolean bool = assignment11.arrayEqual(array1,array3);
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
        }
        if(bool==true)
        {
            System.out.println("Arrays equal!!");
        }
        else {
            System.out.println("Arrays not equal !!");
        }


    }
}
/*If arrays are sorted :
then only one for loop is required :

 */
