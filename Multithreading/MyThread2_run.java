public class MyThread2_run implements Runnable {

    @Override
    public void run() {
        for(int i=1; i<=20; i++)
        {
            System.out.println(i);

            try
            {
                Thread.sleep(5000);
            }catch(Exception e)
            {}
        }
    }
    public static void main(String[] args)
    {
        MyThread2_run t1 = new MyThread2_run();
        //creating the reference
        Thread th = new Thread(t1);
        th.start();
    }
    
}
