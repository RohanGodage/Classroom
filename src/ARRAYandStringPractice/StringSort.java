package ARRAYandStringPractice;

public class StringSort {

    int [] arrayofCount2(String str1)
    {
        int [] arrayofCount2 = new int [str1.length()];
        for (int i = 0; i < str1.length(); i++)
        {
            for (int j = 0; j < str1.length(); j++)
            {
           if(str1.charAt(j)==str1.charAt(i))
                {
            arrayofCount2[i]++;

        }
            }
        }
return  arrayofCount2;

        }
    String [] arrayofChar(String str1)
    {
        String [] arrayofChar = new String [str1.length()];
        for (int i = 0; i < str1.length(); i++)
        {
            for (int j = 0; j < str1.length(); j++)
            {
                if(str1.charAt(j)==str1.charAt(i))
                {
                    arrayofChar[i]= String.valueOf(str1.charAt(i));

                }
            }
        }
        return  arrayofChar;

    }

    public static void main(String[] args) {
        StringSort arraysort = new StringSort();
        String str1 = " kjhfiopqowpeiweuiythkdfhdgllkakdhmnzmznbnczvbmcz";
        int [] arraycount = arraysort.arrayofCount2(str1);

        String[] arrayofChar = arraysort.arrayofChar(str1);

        for (int i = 0; i <arrayofChar.length ; i++) {
            System.out.println("The char : "+ arrayofChar[i]+ " is occuring for " +arraycount[i] + " times.");

        }

    }
}
