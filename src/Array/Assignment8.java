package Array;

public class Assignment8 {
    public static void main(String[] args) {
        int [] array =  {20,5,60,10,77,75,78,22,3,5,1,90};
        int largest=0;
        int smallest =9999;
        for (int i = 0; i < array.length; i++) {
                if(largest<array[i])
                {
                    largest=array[i];
            }
                if (smallest>array[i])
                {
                    smallest=array[i];
                }
        }
        System.out.println("largest : "+largest);
        System.out.println("smallest : "+smallest);
    }
}
