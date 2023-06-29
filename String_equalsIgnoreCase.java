import java.util.Scanner;
public class String_equalsIgnoreCase {
    public static void main(String[] args) 
    {
        String str1 = "Hello Prince";
        String str2 = "hellO PriNCE";
        String str3, str4;
        System.out.println(str1.equalsIgnoreCase(str2));

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String ");
        str3=sc.nextLine();
        System.out.println("Enter the second String : ");
        str4=sc.nextLine();

        System.out.println(str3.equalsIgnoreCase(str4));

    }
    
}
