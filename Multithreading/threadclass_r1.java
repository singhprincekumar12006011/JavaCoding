public class threadclass_r1 extends Thread {
    
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("*");
            try 
            {
                sleep(1000);
                
            }catch(Exception e)
            {

            }
        }
    }
    public static void main(String args[])
    {

        threadclass_r1 t = new threadclass_r1();
        Thread th = new Thread(t);
        th.start();
        th.getName();
    }
}
