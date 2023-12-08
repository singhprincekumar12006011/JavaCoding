package Multithreading;

public class ThreadRun1 implements Runnable{
	
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+"\n");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
		
	}
	public static void main(String[] args)
	{
		ThreadRun1 t1 = new ThreadRun1();
		Thread th = new Thread(t1);
		ThreadClass1 th2 = new ThreadClass1();
		
		th.start();
		th2.start();
		
	}

}
