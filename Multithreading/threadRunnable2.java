public class threadRunnable2 implements Runnable {
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("* ");
                try{
                    Thread.sleep(1000);
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        threadRunnable2 r = new threadRunnable2();
        Thread th = new Thread(r);
        th.start();
    }
    
}
//  