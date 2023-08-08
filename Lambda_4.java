import java.util.*;

interface lam {
    public double div(int a, int b);
}

public class Lambda_4 {
    public static void main(String[] args) {
        lam divide = (int x, int y) -> {
            if (y != 0) {
                return (double) x / y;
            } else {
                throw new IllegalArgumentException("Divisor cannot be zero.");
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of dividend:");
        int p = sc.nextInt();
        System.out.println("Enter the divisor:");
        int t = sc.nextInt();

        try {
            double result = divide.div(p, t);
            System.out.println("The division of " + p + " and " + t + " = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
