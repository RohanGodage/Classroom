package Error_Handling;

public class bjksdfhkjds {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);

            } catch (Exception exception) {
                System.out.println(10 / 0);
            }
        }
            catch(Exception exception)
            {
                System.out.println("outer catch");
            }
            System.out.println("rest of the code");
        }

}
