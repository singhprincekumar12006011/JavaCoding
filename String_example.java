public class String_example {
    public static void main(String[] args)
    {
        String str = "Prince";

        // to find the length of string.
        System.out.println("Tnhe length of string " + str + " " + str.length());

        //to find character at specific position.
        System.out.println("The character at 3 is " + str.charAt(3));

        // to print the sub string after the specific index
        System.out.println("the substring is :" + str.substring(2));

        //to print substring having range
        System.out.println("The substring is " + str.substring(2, 3)); 
    }
    
}
