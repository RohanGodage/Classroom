package classnotes;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a = 50;
        int[] array     =      new         int      [10];
  /*      ^       ^              ^          ^        ^
          |       |              |          |        |
     dataType   reference      KEYWORD    Data     no of elements
                variable       {OBJECT}    Type   (Size of an array)
   left squARE bracket is to describe that it i s array type of variable

   */

        Scanner sc = new Scanner(System.in);
        for(int i =1;i<= 5;i++){
            System.out.println("Enter "+ i + "th element");
            array[i] = sc.nextInt();
        }
        for(int i =1;i< array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("array[4] : "+array[4]);
        Array[] array2 = new Array[10];//class type array
        /*
        int [] array1;declaration
        array1 = new int[5];//Initialization
        e.g.
        int [] array = new int [5];
        array : reference variable which points to an object
        new int[5] : an object which stores 5 variables


        int [] negarray= new int[5];
        for(int j =negarray.length-1;j>=-1;j++){
            System.out.println("negative array eleemnt " +negarray[j]);//Gives runtime array
            }
         */
        }

}
