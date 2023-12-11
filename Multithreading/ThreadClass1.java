public class ThreadClass1 extends Thread{
    public void run()
    {
        for(int i=0; i<=10; i++)
        {
            System.out.println("the value of i "+ i);
            try
            {
                Thread.sleep(1000);
            }catch(Exception e)
            {

            }
        }
        
    }
    public static void main(String[] args)
        {
            ThreadClass1 th1 = new ThreadClass1();
            Thread th = new Thread(th1);
            th.start();
        }
}
