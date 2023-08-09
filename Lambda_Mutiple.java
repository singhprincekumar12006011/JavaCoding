import java.util.*;
interface Multiple {
    public int mult(int x, int y);
}
public class Lambda_Mutiple {
    public static void main(String[] args) 
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a=sc.nextInt();
        System.out.println("Enter the value of b :");
        b=sc.nextInt();

        Multiple m1 = (int x, int y) -> {
            return (x * y);
        };

        int result = m1.mult(a, b);

        System.out.println(result);
    }
}
