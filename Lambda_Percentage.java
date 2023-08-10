import java.util.*;

interface MyLambda {
    public double per(double x, double y);
}

public class Lambda_Percentage {
    public static void main(String[] args) {
        MyLambda perMyLambda = (x, y) -> {
            return (x / y) * 100;
        };
        double a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the obtained number:"); // Fixed typo ("optained" to "obtained")
        a = sc.nextDouble();
        System.out.println("Enter the total number:");
        b = sc.nextDouble();

        double result = perMyLambda.per(a, b);
        System.out.println("The percentage of " + a + " in " + b + " is: " + result);
    }
}
