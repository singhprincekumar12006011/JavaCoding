public class String_Exaple_StringBuffer {
    public static void main(String[] args)
    {
        String str ="Prince";
        String str2 = str;
        str = str + " Kumar";
    
        if(str == str2)
        {
            System.out.println("Same");
        } else 
        {
            System.out.println("String " + str + " Not same  to : " + str2  + " string");
        }

        StringBuffer str3 = new StringBuffer("Prince");
        StringBuffer str4 = str3;

        str4.append(" Kumar");

        if(str4 == str3)
        {
             System.out.println("same");
        } else
        {
            System.out.println("Not same :");
        }
        
    }
}
