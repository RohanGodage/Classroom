package Array;

public class Assignment10 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(array[i]==array[j])
                {
                    System.out.println("Duplicate value found at index : "+ j +" for value  : "+array[j]);
                }
            }
        }
    }
}
