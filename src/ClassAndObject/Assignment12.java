package ClassAndObject;

public class Assignment12 {
    int rows;
    int columns;

    public Assignment12(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }
    int count = 1;
        int[][] arr (int arr[][]){
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr.length; j++)
                {
                    arr[i][j]=count;
                    count++;
                }

            }
            return arr;
        }



    public static void main(String[] args) {
        int rows=3;
        int cols=3 ;
        int [][] arr = new int[rows][cols];
        Assignment12 assignment12= new Assignment12(rows,cols);
        assignment12.arr(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
