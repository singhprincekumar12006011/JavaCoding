public class thread_runnable1 implements Runnable {
    public void run()
    {
        System.out.println("This is demo program...");

    }
    
    public static void main(String[] args) {
        
        thread_runnable1 tr = new thread_runnable1();
        Thread th  = new Thread(tr);
        th.start();
    }
}
