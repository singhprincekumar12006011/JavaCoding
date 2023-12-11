//wap program to display the current thread that is running 

public class display_thread extends Thread {

    public void run()
    {
        try
        {
            System.out.println("thread...." + Thread.currentThread().getId() + " is running");
        }
        catch(Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
    public static void main(String[] args) {

        display_thread dt = new display_thread();
        dt.start();

        
    }
}
