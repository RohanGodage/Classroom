package ClassAndObject;

public class Assignment13 {
    int rows;
    int cols;

    public int getRows(int [][] arr) {
        return rows;
    }

    public int getCols(int[][] arr) {
        return cols;
    }


    public static void main(String[] args) {
        int count =1 ;
        int i =0;
        int j =0;

        int[][] arr = new int[3][3];
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++)
            {
                      arr[i][j]= count;
                      count++;

            }

        }
        System.out.println(arr.length);
    }
    //ADDING TWO MATRIX
    //IF NOT ADDABLE+"MATRICES CAN NOT BE ADDED
    //MULTIPLYING BOTH


}
