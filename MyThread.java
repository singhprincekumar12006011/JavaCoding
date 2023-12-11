class MyThread implements Runnable{
    public void run()
    {
        //create a task for thread
        for(int i=1; i<= 10; i++)
        {
            System.out.println("The value of i "+ i);
            try{
                Thread.sleep(1000);
            }catch(Exception e)
            {}
            
        
        }
        
    }

    public static void main(String[] args)
    {
        MyThread t1 = new MyThread();
        //create the referrence of t1 to run the thread.
        Thread t = new Thread(t1);
        t.start();
    }
}