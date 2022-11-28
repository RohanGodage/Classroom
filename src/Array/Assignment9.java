package Array;

public class Assignment9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] arrayrev = new int[5];
       /* for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j >=0; j--) {
                arrayrev[j] = array[i];

            }
        }*/
       /* for(int i =0;i<= array.length;i++){
            for (int j = 0; j < arrayrev.length; j++) {
                System.out.println(arrayrev[j]);

            }
        }*/

        for (int i = array.length-1; i>=0; i--) {
            for (int j = 0; j< i; j++) {
                arrayrev[i]=array[j];
            }
        }

        for (int i = 0; i <= arrayrev.length; i++) {
            System.out.println(arrayrev[i]);
        }
    }

    }
