//WAP a program to 5 pair of integers form user.
// for every pair (x,y), it should print (x/y) if y  is not 0.


import java.util.Scanner;

public class Continue1 {
    public static void main(String[] agrs) {
        int x;
        int y;
        System.out.println("Enter the value of x");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Enter the value  of y");;
        y = sc.nextInt();
        for(int i=0; i<5; i++) {
            if(y == 0){
                continue;
            }
            System.out.println(x/y);
        }
    }

}
