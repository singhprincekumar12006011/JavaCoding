
// WAP to print the hello world using method:
import java.util.Scanner;
public class Method_First {
    public static void main(String[] args) {
        
        int x , y;
        System.out.println("enter the first number");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Enter the second number");
        y = sc.nextInt();
        
        if(x>y) {
        fun();
        } else {
            funs();
        }        
    }
    public static int fun() {
        System.out.println("Hello World");
        return 0;
        
    }
    public static int funs() {
        System.out.println("Hello this Prince");
        return 0;
    }
}