package classnotes;

public class mainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("main method regular");
        main();
    }
    public static void main(){
        System.out.println("overloaded main method !!");
    }
}
