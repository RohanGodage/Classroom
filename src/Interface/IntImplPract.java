package Interface;

public interface IntImplPract {
    void run();
}
class subIntImplPract implements IntImplPract{
    @Override
    public void run(){
        System.out.println("traditional wayy run");
    }

    public static void main(String[] args) {
        subIntImplPract subIntImplPract =new subIntImplPract();
        subIntImplPract.run();
        IntImplPract intImplPract = new IntImplPract() {
            @Override
            public void run() {
                System.out.println("Anonymous way...");
               }
              };
        intImplPract.run();
        IntImplPract intImplPract1 = ()->{
            System.out.println("lambda wayy");
        };
        intImplPract1.run();

    }
}

