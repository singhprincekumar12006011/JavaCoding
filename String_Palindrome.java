

//WAP to check the string is palindrome or not. Take the string as input from user.

import java.util.Scanner;
public class String_Palindrome {
    public static void main(String[] args)
    {
        String str1;
        
        System.out.println("Enter the String :");
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();

        // to store the all index of string (index =  length -1)
        int ptr = str1.length() - 1;

        int start = 0;//Starting index 
        int end = ptr;//end index
        

       //it will match the character of first and last. if it not match then it come out of the loop and print not a palindrome.
       //if the character is matches then it go for second index and second last index element.
       /* 
        while (start < end) {
            if (str1.charAt(start) != str1.charAt(end)) {
                System.out.println("Not a palindrome.");
                return;
            }
            
            start++;
            end--;
        }
        
        System.out.println("Palindrome.");
        */
        for(int i=0; i<ptr; i++)
        {
            if(str1.charAt(i) != str1.charAt(ptr))
            {
                System.out.println("No");
                return;
            }
            ptr--;
        }
        System.out.println("Yes");
    }
    
}
