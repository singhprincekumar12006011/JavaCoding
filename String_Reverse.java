//Wap to print the reverse of string. Take the string as input from the user.

import java.util.Scanner;
public class String_Reverse {
    public static void main(String[] args)
    {
        String str1;
        String str2 = " ";

        Scanner sc = new Scanner(System.in);
        str1=sc.nextLine();

        int ptr = str1.length() - 1;

        /* 
        while(ptr >= 0)
        {
            str2 = str2 + str1.charAt(ptr);
            ptr--;
        }

        */
        for(int i=ptr; i >= 0; i--)
        {
            str2 += str1.charAt(ptr);
            ptr--;
        }
        System.out.println(str2);

    }
    
}
