
import java.util.Scanner;
public class String_Class_Declaration_1 {
    public static void main(String[] args)
    {
        //declaration of an String and also assing the value.
        String str="Prince";
        System.out.println(str);

        //Declaration of string str_2
        String Str_2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        //Assing the value to Str_2.
        Str_2 = sc.nextLine();
        sc.close();
        System.out.println("The string that you have entered is " + Str_2);
    }
    
}
