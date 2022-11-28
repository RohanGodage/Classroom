
package String;

import java.util.Arrays;

public class Assignment2 {
    public static int countWords(String str1)
    {
        if(str1 == null )
        {
            return 0;
        }
        String [] words1 = str1.split(" ");

        return words1.length;
    }
    public static void main(String[] args) {
        int count = 0;
        String str1 = "This is an example of counting number of words in a given string";
        System.out.println("No of words : "+ countWords( str1));

    }


}

// Java program to count total
// number of words in the string
/*
public class Assignment2
{

    // Function to count total number
    // of words in the string
    public static int
    countWords(String str)
    {

        // Check if the string is null
        // or empty then return zero
        if (str == null || str.isEmpty())
            return 0;

        // Splitting the string around
        // matches of the given regular
        // expression
        String[] words = str.split("\\s+");

        // Return number of words
        // in the given string
        return words.length;
    }

    // Driver Code
    public static void main(String args[])
    {

        // Given String str
        String str =
                "One two       three\n four\tfive ";

        // Print the result
        System.out.println("No of words : " +
                countWords(str));
    }
}
*/
