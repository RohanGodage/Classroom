package StringHandling;

public class Demo4 {
    public static void main(String[] args) {
        String str1 = new String("Java is easy language");
        System.out.println(str1);

        str1=str1.replace('a','@');
        System.out.println(str1);

        str1=str1.replace("e@sy","hard");
        System.out.println(str1);

        System.out.println(str1.startsWith("J"));
        System.out.println(str1.endsWith("f"));
        System.out.println(str1.charAt(4));
        //anonymous array
        String str2 = new String(new char [] {'A','B'});
        System.out.println(str2);

        StringBuilder stringBuilder= new StringBuilder("abc");
        System.out.println(stringBuilder);
        stringBuilder.replace(0,stringBuilder.length(),"HELLO WORLD");
        System.out.println(stringBuilder);
        stringBuilder.delete(0,1);
        System.out.println(stringBuilder);
        stringBuilder.insert(0,"hhhhhhh");
        System.out.println(stringBuilder);
        //index of
        StringBuilder stringBuilder2 = new StringBuilder("Welcome to fanala dikana");
        System.out.println(stringBuilder2.indexOf("to"));
        System.out.println(stringBuilder2);
        //char array
        char [] chars = new String (stringBuilder).toCharArray();
        int start = 0;
       /* for(int index=start;index<chars.length;index++)
        {
            if(chars[index] = "to")
            {
                System.out.println("Null value at "+index +"location");
            }
        }
        */
        //string buffer is thread safe class
        //string buffer is faster
        //STRING V/S STRING BUFFER V/S STRING BUILDER
    }
}
