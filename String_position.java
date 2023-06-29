

import java.util.Scanner;
public class String_position {
    public static void main(String[] args)
    {
        String str1;
        String str2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string :");
        str1=sc.nextLine();
        System.out.println("Enter the string to the occurance :");
        str2=sc.nextLine();
        sc.close();

        //calling pattSearch function
        patt_search(str1, str2);
    }
    public static void patt_search(String s1, String s2)
    {
        int position=s1.indexOf(s2);

        while(position >=0)
        {
            System.out.print(position + " ");
            position=s1.indexOf(s2, position + 1);
        }
    }
    
}
