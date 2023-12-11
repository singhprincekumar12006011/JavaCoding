// write program to multiple thread with different function.

public class multiple_thread  extends Thread{

    public static void main(String[] args)
    {
        Thread th1 = new Thread(() -> {

            System.out.println("The id of th1 thread is "+Thread.currentThread().getId());
            for(int i=0; i < 10; i++)
            {
                System.out.println(i+" ..........." );
                try{
                    Thread.sleep(1000);
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            Thread.currentThread().setName("Prince Kumar");
            System.out.println(Thread.currentThread().getName());
        });

        Thread th2 = new Thread(() -> {

            Thread.currentThread().setPriority(1);
            for(int i=0; i<10; i++)
            {
                System.out.println(i);
                
                try
                {
                    Thread.sleep(1000);
                }catch(Exception e)
                {
                    e.printStackTrace();
                }

            }

        });
        th1.start();
        th2.start();
    }
    
}
