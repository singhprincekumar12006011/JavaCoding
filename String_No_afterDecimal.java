
import java.util.Scanner;
public class String_No_afterDecimal {
    public static void main(String[] args)
     {
        String str1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string :");
        str1=sc.nextLine();
        sc.close();

        //calling pattSearch function
     
        String str2  = DigitAfterDecimal(str1);
        System.out.println(str2);
    }
    public static String DigitAfterDecimal(String str)
    {
        int position = str.indexOf('.');

        if(position < 0)
        {
            return " ";
        } else
        {
            return str.substring(position + 1);
        }
        
    }
    
}
