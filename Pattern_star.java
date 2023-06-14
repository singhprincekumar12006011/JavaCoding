import java.util.Scanner;

public class Pattern_star {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter the number of row:");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        for(int i=1; i<=x; i++) {
            for (int j = x; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=x; i++) {
            for(int j=1; j<=i+1; j++) {
                System.out.print(" ");
            }
            for(int k=x; k >=i+1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
