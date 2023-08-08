import java.util.*;

interface lam {
    int mult(int x, int y);
}

public class Lambda_3 {
    public static void main(String[] args) {
        lam multiLam = (int a, int b) -> a * b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y = sc.nextInt();
        int result = multiLam.mult(x, y);
        System.out.println("The multiplication of two numbers is: " + result);
    }
}



