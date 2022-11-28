package ExceptionHandling;

import java.io.*;
class DBZ {
    public static void findFile() throws NullPointerException, IOException, InvalidClassException {

        // code that may produce NullPointerException
  //  … … …

        // code that may produce IOException
  //  … … …

        // code that may produce InvalidClassException
  //  … … …
    }

    public static void main(String[] args) {
        try{
            findFile();
        } catch(IOException e1){
            System.out.println(e1.getMessage());
        } catch(NullPointerException e2){
            System.out.println(e2.getMessage());
        }
    }
}