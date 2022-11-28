package Methods;

public class Assignment22sub extends Assignment22 {
    void printNum(int j) {
        System.out.println(j);
    }

    public static void main(String[] args) {
        Assignment22 assignment22 = new Assignment22sub();
        assignment22.printNum(10);
        Assignment22sub assignment22sub = new Assignment22sub();
        assignment22sub.printNum(20);
    }
}
