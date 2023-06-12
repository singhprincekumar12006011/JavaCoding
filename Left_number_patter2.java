/*
WAP to print the pattern of left number
Each row start with 1.


1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 


 */

import java.util.Scanner;

public class Left_number_pattern {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number of row to be print");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
