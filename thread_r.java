public class thread_r extends Thread {

    public void run() 
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Hello this is Prince Kumar .....");
            try 
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        thread_r tr = new thread_r();
        Thread th = new Thread(tr);
        th.start();
    }
}
