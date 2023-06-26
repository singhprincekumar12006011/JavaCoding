public class String_StrBuffer_1 {
    public static void main(String[] args) {
        
        StringBuffer str_Buff = new StringBuffer();

        //Append
        str_Buff.append("Hello");
        str_Buff.append(" ");
        str_Buff.append("Prince");
        System.out.println(str_Buff);

        //insertion
        str_Buff.insert(6, "Awesome");
        System.out.println(str_Buff);

        //Deletion
        str_Buff.delete(5, 13);
        System.out.println(str_Buff);

        //Replace 
        str_Buff.replace(7,12, " Everyone");
        System.out.println(str_Buff);

        //convert
        String result = str_Buff.toString();
        System.out.println(result);
    }
}
