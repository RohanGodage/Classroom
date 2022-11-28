package Operators;

public class Extra {
    public static void main(String[] args) {
        double principle = 100;
        double roi = 0.01;
        double finalamt = 0;
        for (int i = 0; i < 12; i++)
        {
            finalamt=finalamt+(roi*principle+100);
            principle+=100+roi*principle;
        }
        System.out.println(finalamt);
    }
}
