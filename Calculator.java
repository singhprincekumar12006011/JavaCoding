// WAP the to perform the operation on the basic of input operator



import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("Welcome to calculator. we can perform operation between two number");
        int num1;
        int num2;
        char oper;
        double result;
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter the operator");
        oper = sc.next().charAt(0);
        System.out.println("Enter the second number");
        num2 = sc.nextInt();



        switch(oper){
            case('+'):
                result = num1 + num2;
                System.out.println("The sum is " + result);
                break;
            case('-'):
                result = num1 - num2;
                System.out.println("The subtration is " + result);
                break;
            case('*'):
                result = num1 * num2;
                System.out.println("The multiplication is " + result);
                break;
            case('/'):
                result = num1 / num2;
                System.out.println("The Division is " + result);
                break;

            case('%'):
                result = num1 % num2;
                System.out.println("The modulus is " + result);
                break;


        }

    }
}
