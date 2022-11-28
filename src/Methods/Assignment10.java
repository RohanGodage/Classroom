package Methods;

public class Assignment10 {
    int num =15;
    int recursion(int num){
        for (int i =1;i<=10;i++)
        {
            System.out.println("15 * "+i+" = "+num);
            num+=15;

        }

        return num;
    }
    public static void main(String [] args){
        int num=15;
        Assignment10 assignment10 = new Assignment10();
        assignment10.recursion(num);


    }
}
