package GlobalLogicAssessment;

public class Problem01 {
    public static void main(String[] args) {
        String para = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
        String  sub = "is" ;
        remove(para,sub);
    }
    public static  void remove (String str1,String str2){
        String msg[] = str1.split(" ");
        String new_string =" ";
        for (String words : msg) {
            if (!words.equals(str2))
            {
                new_string+=words+" ";
            }
        }
        System.out.println(new_string);


    }
}
