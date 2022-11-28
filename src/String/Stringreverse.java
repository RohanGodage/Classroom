package String;
public class Stringreverse {
    public static void main(String[] args) {
    /*
        String str = "Learning";
        String reversestring =  "";

        for (int i =str.length();i>=0;i--)
        {
                char ch=str.charAt(i);
                reversestring=reversestring+ch;
            }
        System.out.println(reversestring);

        }

}
*/

        String str= "Geeks", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            System.out.println(ch);
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
