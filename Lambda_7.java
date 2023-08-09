interface Drowable
{
    public void Drow();//abstract method. 
}

public class Lambda_7 {
    public static void main(String[] args)
    {
        int width=10;

        Drowable d2 = () -> {
            System.out.println("Drowable " + width );
        };

        d2.Drow();
    }
}
