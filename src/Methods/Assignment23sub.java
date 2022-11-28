package Methods;

public class Assignment23sub extends Assignment23 {
    static void method() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Assignment23sub assignment23sub = new Assignment23sub();
        assignment23sub.method();
        Assignment23 assignment23 = new Assignment23sub();
        assignment23.method();



    }
}
