package Multithreading;

public class ThreadClass1 extends Thread{
	public void run()
	{
		for(int i=10; i>=1; i--)
		{
			System.out.println(i + " \n");
			try
			{
				Thread.sleep(1000);
			}catch(Exception e)
			{
				
			}
		}
	}
}
