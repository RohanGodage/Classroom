package Array;

public class Assignment3 {
    public static void main(String[] args) {
        int[] array = {'a','v','f','a','f',45,67,30,45};
       /* for(int i =0;i< array.length;i++)
        {
            if(array[i]==4) {
                System.out.println( );
            }
        }*/
        char ch = 'f';
        int digit = 46;
        Assignment3 assignment3 = new Assignment3();
        assignment3.checkChar(ch,array);
        assignment3.checkDigit(digit,array);
    }
    public  int checkChar(char ch,int[] array)
    {
        int flag =0;
        for(int i =0;i< array.length;i++)
        {
            if(array[i]==ch)
            {
                System.out.println( "Found char : " + array[i] + " at "+i+"th location.");
                flag++;

            }

        }
         if(flag==0) {
             System.out.println("CHAR NOT PRESENT !!");
         }
    return ch;
    }
    public  int checkDigit(int digit,int[] array)
    {
        int flag=0;
        for(int i =0;i< array.length;i++)
        {
            if(array[i]==digit)
            {
                System.out.println( "Found digit : " + array[i] + " at "+i+"th location.");
                flag++;
            }


        }
        if(flag==0) {
            System.out.println("DIGIT NOT PRESENT !!");
        }
        return digit;
    }

}
