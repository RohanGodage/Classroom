package Array;

public class ArrayofArray {
    public static void main(String[] args) {
        int [] []  arrayOfarray = {{1,2,3,4,5},{1,2,3,4}};

        System.out.println(arrayOfarray);//MEMORY ADDRESS
        System.out.println(arrayOfarray[0]);//M.A.
        System.out.println(arrayOfarray[1]);//M.A.

        System.out.println(arrayOfarray[0][0]);//ELEMENT OF 0TH ARRAY AND 0TH INDEX
        System.out.println(arrayOfarray[1][2]);//ELEMENT OF 1ST ARRAY AND 2ND INDEX
        System.out.println(arrayOfarray[1][3]);//ELEMENT OF 1ST ARRAY AND 3RD INDEX
        System.out.println("ALL ELEMENTS :::");
    //print all elements
    for (int row =0;row< arrayOfarray.length;row++)
    {
        for (int column = 0; column < arrayOfarray[row].length; column++) {
            System.out.println(arrayOfarray[row][column]);
        }
    }
    }
}
