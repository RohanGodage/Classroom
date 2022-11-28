package String;

public class Assignment4 {


    int[] search (String str){
        int [] arrayofCount = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j))
                {
                    arrayofCount[i]++;

                }
            }

        }

        return arrayofCount ;
    }

    String[] storechar (String str){
        String [] arrayOfChar = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j))
                {
                    arrayOfChar[i]= String.valueOf(str.charAt(i));

                }
            }

        }

        return arrayOfChar ;
    }

    public static void main(String[] args) {
        Assignment4 assignment4 = new Assignment4();
        String str = "BCDEFGHIJKLSKCNDIUVGKLKAJZNQPOWIEOUWERYTUIVBNMXCBS";
        int [] arrayofCount =  assignment4.search(str);
        String [] arrayofChar =  assignment4.storechar(str);
        for (int i = 0; i < arrayofCount.length; i++) {
            System.out.println("The char at " +arrayofChar[i]+" is "+ arrayofCount[i]);

        }
    }



}
