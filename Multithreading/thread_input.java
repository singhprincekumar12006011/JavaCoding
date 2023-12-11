
import java.util.*;
public class thread_input {


    //creating main method 
    public static void main(String[] args)
    {
        //create and start the input  thread 
        Thread inpuThread = new Thread(new InputRunnable());
        inpuThread.start();

        try{
            Thread.sleep(10000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        for(int i=0; i<=5; i++)
        {
            System.out.println("Main Thread: " + i);

            try
            {
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class InputRunnable implements Runnable 
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);

        //take the string as input from user.
        System.out.println("Enter the string .....and hit enter......... .");
        String userInput = sc.nextLine();

        System.out.println("Your input is ....  " + userInput);
        sc.close();

        
    }
}