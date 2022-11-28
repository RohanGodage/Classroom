package LetsProgram;

public class Assignment03 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i < row; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = row - i; j > 0; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
        int space = 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < space - 2; j++) {
                System.out.print(" ");

            }
            space--;
            for (int j = 0; j < row; j += 2) {
                for (int k = 0; k < row; k += 2) {
                    System.out.print("* ");

                }
                row--;
                System.out.println();
            }
        }
    }
}
