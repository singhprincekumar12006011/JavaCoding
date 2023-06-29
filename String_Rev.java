
import java.util.Scanner;
public class String_Rev {
    public static void main(String[] agrs)
    {
        String str = new String();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();

        
        System.out.println("the string that you have entered is : " );
        //converting the string to stringbuffer
        StringBuffer strBuf = new StringBuffer(str);
        strBuf.reverse();
        System.out.println(strBuf + " \n   --------THANKS-------");
    }
}
