public class String_Function_compareTo {
    public static void main(String[] args)
    {
        String str1="Prince Kumar";
        String str2="Prince";

        int result = str1.compareTo(str2);

        if(result == 0)
        {
            System.out.println("Same");

        }

        if(result > 0)
        {
            System.out.println("str1 is greater then str2");

        }
        if (result < 0 ) {
            System.out.println("str1 is smaller then str1 ");
        }
    }
    
}
