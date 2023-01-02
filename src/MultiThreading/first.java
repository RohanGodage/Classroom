

package MultiThreading;

public class first {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i <100 ; i++) {
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        },"custom");
        thread.start();

         thread.join();
         Thread.yield();
        for (int i = 0; i < 100; i++) {
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}