/*

Write a program to take the input from the user and count the digit of the number.

*/




import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int num;
        int result=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (num>0){
            num = num/10;
            result++;
        }
        System.out.println("The number " + num + " is having " + result);
    }
}
