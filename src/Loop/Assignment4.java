package Loop;

public class Assignment4 {
    public static void main(String[] args) {
        int rows = 4;
        int space = 4;
        for (int i = 0; i < rows; i++)
        {
            for (int k = space-i; k <rows; k++) {
                System.out.print(" ");

            }
            for (int j = rows; j > i; j--) {
                System.out.print("1");

                System.out.print("0");
            }
            System.out.println();
        }
    }
}
