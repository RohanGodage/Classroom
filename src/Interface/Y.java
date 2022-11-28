package Interface;
abstract interface alpha{
    abstract void run();
}
class A implements alpha{


     @Override
     public void run() {
         System.out.println("run traditional");
     }
     public static void main(String[] args) {
         A a = new A();
         a.run();
         //A b = new A();
         alpha alpha = new alpha(){
            @Override
            public void run()
            {
                System.out.println("Anonymous way");
            }
         };
         alpha.run();
         alpha c = ()->System.out.println("lambda way");
         c.run();
     }

     }
