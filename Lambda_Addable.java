interface Addable 
{
    public int add(int x, int y);
}

public class Lambda_Addable {
    public static void main(String[] args) 
    {
        int a=10;
        int b=20;
        Addable a1 = (int x,int y) -> {
            return x+y;
        };

        int sum = a1.add(a, b);
        System.out.println(sum);
    }
}
