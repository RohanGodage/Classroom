package Pattern;

public class RightTriangle {
    public static void main(String[] args) {
        ;
        int rows = 10;
        for (int i = 0; i < rows; i++) {
            for (int j = 2 * (rows - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println("");

        }


        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


        for (int i = rows-1; i>=0; i--)
        {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        System.out.println(" ");
    }
}
}