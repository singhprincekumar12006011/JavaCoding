
//WAP to find the sum of two number using lambda expression.


import java.util.*;
interface lambdaa {
    int exp(int x, int y);
}

public class Lambda_2 {
    public static void main(String[] args) {
        // Assign the lambda expression to the lambdaa functional interface
        lambdaa epresLambdaa = (int a, int b) -> a + b;

        // Call the exp method using the lambda expression
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of x");
        int x = sc.nextInt();
        System.out.println("Enter the number of y");
        int y = sc.nextInt();
        int result = epresLambdaa.exp(x, y);
        System.out.println("Result: " + result);
    }
}
