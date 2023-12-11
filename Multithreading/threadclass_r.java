public class threadclass_r extends Thread {
    
public void run()
{
    System.out.println("hello........");
    try
    {
        sleep(2000);
    }catch(Exception e)
    {

    }
    System.out.println("This is demo program");
}
    public static void main(String[] args) {
        threadclass_r t = new threadclass_r();
        Thread th = new Thread(t);
        th.start();
    }
}
