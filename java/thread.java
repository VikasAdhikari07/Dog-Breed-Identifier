class thread1 implements Runnable{
    public void run(){
        for (int i = 0; i < 40; i++) {
            System.out.println("Thread 1");
        }
    }

}

class thread2 implements Runnable{
    public void run(){
        for (int i = 0; i < 40; i++) {
            System.out.println("Thread 2");
        }
    }
    
}

/**
 * thread3 
 */
class thread3 extends Thread  {

    public void run()
    {
        for (int i = 0; i < 40; i++) {
            System.out.println("Thread 3");
        }
    }
}
/**
 * thread
 */
public class thread {

    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        Thread tobj1 = new Thread(t1);
        Thread tobj2 = new Thread(t2);
        thread3 obj = new thread3();
        obj.start();
        tobj1.start();
        tobj2.start();
    }
}
