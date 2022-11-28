/*
package Error_Handling;

public class errorHandling {
    public static void main(String[] args) {
        exception is in throwable which is in java.lang package
                            java.lang
                                |
                            /        \
                          /            \
              exception ()                error()
                  |                   1)Array out of Bound
          Run Time Exception          2)-ve array size exception
     1)No such method exception       3)Null pointer exception
     2)No such field                  4)Input mismatch
     3)Class not found                5)String IOUE
     4)illegal access exception       6)Illegal argument
     5)clone not supported
     5)IO Exception




        FLOW OF EXCEPTION : new object created-> JRE ->DEH(Default Exception Handler) ->prints exception details and terminated the program

        ERROR HANDLING  :
        1)USING TRY CATCH FINALLY BLOCK
        2)USING THROWS

        1)Using try cath finally
        try{
                    ----
                    -----
                    -----
        }

        catch
        {
            ----
            ----
            ----
        }
        finally
        {
        =---=-=-=-=-=-=-
        -=-=-=-=-=-=
        }
        //finally will execute irrespective of what block is printing.




    }
}
*/
//INTERVIEW QUESTION

package Error_Handling;

public class errorHandling {
    public static void main(String[] args)
    {
       try {
           new ArithmeticException("Divide by zero......");
       } catch (ArithmeticException exception) {
           System.out.println("catch");
           System.out.println(10 / 0);
       } finally {
           System.out.println("finally");
       }
       System.out.println("rest of the code");
   }
    }