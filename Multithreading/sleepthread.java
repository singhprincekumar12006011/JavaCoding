public class sleepthread extends Thread {

    public void run()
    {
        System.out.println("This is demo program....");

        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {

        }

        System.out.println("There is a hold for 1000 milisecond ......");
    }
    public static void main(String[] args) {
        sleepthread sp = new sleepthread();
        Thread th = new Thread(sp);
        th.start();
    }
}
