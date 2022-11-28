package Methods;

public class Assignment21 {
    static int balanceA;

    public Assignment21(int balanceA) {
        this.balanceA = balanceA;
    }

    public class BankA{
        static void getBalance(){
            System.out.println("Balance in Bank A : "+balanceA);
        }
    }

    public class BankB{
        static void getBalance(int balanceB){
            System.out.println("Balance in Bank A : "+balanceB);
        }
    }
    public class BankC{
        static void getBalance(int balanceC){
            System.out.println("Balance in Bank A : "+balanceC);
        }
    }

    public static void main(String[] args) {
        int balanceA=1000;
        int balanceB=1500;
        int balanceC=2000;
        Assignment21 assignment21= new Assignment21(balanceA);
        Assignment21.BankA.getBalance();
        Assignment21.BankB.getBalance(balanceB);
        Assignment21.BankC.getBalance(balanceC);
    }
}
