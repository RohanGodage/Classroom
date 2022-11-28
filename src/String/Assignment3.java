
package String;

public class Assignment3 {
    public static void main(String[] args) {
        String str1 = "This is an example of counting This number of words in a given This string";

        String subStr = "This";
        System.out.println("Total no of occurences of  "+"["+subStr+"] :"+" is "+countwordoccurence(str1,subStr));
    }
    public static int countwordoccurence(String str1,String subStr){

        int count = 0;
        for (int i = 0; i < str1.length()-subStr.length(); i++) {

            if (str1.substring(i, i + subStr.length()).equals(subStr))
            //   if (str1.substring(0, i+subStr.length()).equals(subStr))
            {
                count++;


            }
        }
        return count;


}}

/*
package String;
public class Assignment3
{
    static int countSubstring(String str, String subStr)
    {
        // the return value
        int count = 0;

        // loop to traverse through the string
        for (int i = 0; i <= str.length() - subStr.length(); i++) {

            // if match found
            if (str.substring(i, i + subStr.length()).equals(subStr)) {
                count++;
            }
        }

        // return the count
        return count;
    }

    // Driver code
    public static void main(String args[])
    {
        String str = "the three truths the truth the truth the truth";
        String subStr = "the";
        System.out.print(countSubstring(str, subStr));
    }
}
*/
