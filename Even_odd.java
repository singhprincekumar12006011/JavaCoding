/*
WAP to check the number is even or not
take input from user.
if even then print even or if odd then print odd

*/




import java.util.Scanner;

public class Even_number {
    public Even_number() {
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("" + n + "is even number ");
        } else {
            System.out.println("" + n + " is a odd number");
        }

    }
}