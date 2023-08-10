interface Sayable 
{
    public String say();
}
public class Lambda_5 {
    public static void main(String[] args)
    {
        Sayable s = () -> {
            return " I am a java programmer:";
        };

        System.out.println(s.say());
    }
}