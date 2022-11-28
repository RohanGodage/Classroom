package Interface;
public interface Interfaceimplementation
{
    abstract void run();
}
class subInterfaceimplementation implements Interfaceimplementation{
    @Override
    public void run()
    {
        System.out.println("Traditional run method");
    }

    public static void main(String[] args) {
        subInterfaceimplementation subInterfaceimplementation = new subInterfaceimplementation();
        subInterfaceimplementation.run();
        Interfaceimplementation interfaceimplementation = new Interfaceimplementation() {
            @Override
            public void run() {
                System.out.println("Anonymous way run method");
            }
        };
        interfaceimplementation.run();
        Interfaceimplementation interfaceimplementation1 = ()->{
            System.out.println("Lambda way run method ");
        };
        interfaceimplementation1.run();
    }

}
