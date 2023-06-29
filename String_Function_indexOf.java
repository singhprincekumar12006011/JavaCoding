public class String_Function_indexOf {
    public static void main(String[] args)
    {
        String str1 = "Prince Kumar";
        String str2 = "Prince";
        String str3 = "Kumar";
        String str4 = "ince";
        String str5 = "prince";

        System.out.println(str1.indexOf(str2)); // it return the first index of occurance - 0
        System.out.println(str1.indexOf(str3)); // it return the first index of occurance - 7
        System.out.println(str1.indexOf(str4)); // it return the first index of occurance - 2
        System.out.println(str1.indexOf(str5)); // it return the negative value because str1 not contain str5 - -1

    }
    
}
