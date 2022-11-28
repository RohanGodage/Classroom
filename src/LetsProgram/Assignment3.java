package LetsProgram;

public class Assignment3 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {    //Outer for loop for no of rows
            for (int j = 0; j < i; j++) {   //Inner for loop to print the spaces
                System.out.print(" ");      //Printing the spaces(NOte : println() is purposely not used.print() is used as we require numerous spaces one after another.)
            }                               //If we use println() then we will only get single space in each row.
           for (int j = rows; j >=i; j--) { //NOTE :   j prints until it is greater than i.Sequence goes like : 5->4->3->2->1
                                             //Second for loop to print the stars.
                System.out.print("* ");      //Printing the stars.
            }

            System.out.println("");          //This statement terminates each row after printing required spaces and stars.
        }                                    //Done with reverse pyramid
        for (int i = rows; i > 0 ; i--) {   //Second loop to print erect pyramid
            for (int j = 0; j <i ; j++) {    //Second loop to print spaces
                System.out.print(" ");       //Printing the spaces
            }
            for (int j = rows; j >i; j--) { //Second loop to print stars.
                System.out.print(" *");     //Printing stars.
            }
            System.out.println("");         //Ending the loop with println after printing required spaces and stars.
        }


    }
}
