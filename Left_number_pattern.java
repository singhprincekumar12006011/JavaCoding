/*
WAP to print the pattern of left number
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
6 5 4 3 2 1 

 */

import java.util.Scanner;

public class Left_number_pattern {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number of row to be print");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
