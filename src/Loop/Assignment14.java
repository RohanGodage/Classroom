package Loop;

public class Assignment14
{
    public static boolean isPrime(int index) {
        boolean bool = true;

        for (int i = 2; i <= index / 2; i++) {
            if (index%i==0) {
                return false;
            }
        }


        return bool;
    }
    public static void main(String[] args)
    {
        int count =0;
        for (int index = 2; index < 100; index++)
        {

                boolean isPrime=isPrime(index);

            if(isPrime(index)==true)
            {
                count++;
            }
            System.out.print(isPrime?index+" ":"");

        }
        System.out.println("Count : "+count);
    }
}