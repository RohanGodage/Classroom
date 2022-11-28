package Loop;

public class Assignment3 {
    public static void main(String[] args)
    {
        int rows = 5;
        int space = 4;
        int reverserows = 0;
        int reversespace = 0;
        for (int i = 0; i < rows ; i++)
        {
            for (int j = rows-i; j >1; j--)
            {

                System.out.print(" ");

            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
            reverserows = i;
            reversespace = space;

        }

        for (int i = reverserows; i > 0 ; i--) {

            for (int j = 0; j < reversespace-i; j++)
            {
                System.out.print(" ");
            }
            //System.out.print("  ");
            for (int j = i; j >0; j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
