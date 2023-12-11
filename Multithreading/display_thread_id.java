public class display_thread_id extends Thread {

    public void run() 
    {
        try
        {
            System.out.println("The thread id " + Thread.currentThread().getId() + " is running ....");

            Thread.sleep(1000);

            System.out.println("The name of thread is " + Thread.currentThread().getName());
 
            Thread.sleep(1000);
  
            for(int i=0; i< 10; i++)
            {
                System.out.println("hello Prince............");
            }
  
            Thread.sleep(1000);

            Thread.currentThread().setName("Prince");
            System.out.println(getName());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {

        display_thread_id dth = new display_thread_id();
        dth.start();
    }
}
