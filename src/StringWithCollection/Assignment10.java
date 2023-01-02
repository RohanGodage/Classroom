package StringWithCollection;

public class Assignment10 {
   static  boolean onlyDigits(String str ,int length)
    {
        for (int i = 0; i < length; i++) {
            if(str.charAt(i)<'0'|| str.charAt(i)>'9')
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
      String abc = "1234567890098727162534";
        System.out.println(onlyDigits(abc,abc.length()));

    }
}
