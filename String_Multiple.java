//WAP that convert the string into integer and find the multiplication and again convert the integer in to string and print the result
//INPUT:- 
//str1="2"
//Str2="3"
//mult="6"




public class String_Multiple {
    public static String multiply(String num1, String num2) {
        int number1 = Integer.valueOf(num1);
        int number2 = Integer.valueOf(num2);
        int mult=number1*number2;
        String str = String.valueOf(mult);
        return str;
    }
    public static void main(String[] args)
    {
        String str1 = "2";
        String str2 = "3";
        String str_4 = multiply(str1 , str2);
        System.out.println("Result: "  + str_4);
    }
}