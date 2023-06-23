import java.util.Scanner;

public class Patter3 {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter the number of row");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for(int i=1; i<=x; i++) {
            for(int j = x; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for(int k = 2; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
