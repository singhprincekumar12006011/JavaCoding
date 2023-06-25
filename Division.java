import java.util.Scanner;

public class Division {
    public static void main(String[] args)
    {
        int p,m;
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        p=sc.nextInt();
        System.out.println("Enter the second number");
        m=sc.nextInt();
        System.out.println(Div(p,m));
    }
    public static int Div(int x, int y)
    {
        int result = x/y;
        return result;
    }
}
