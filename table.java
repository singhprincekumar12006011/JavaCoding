//WAP to print the m-talbe of a number
// take the number as input from the user.

import java.util.Scanner;

public class Table_of_Number {
    public static void main(String[] args) {
        int number;
        int result=0;
        System.out.println("Enter the number to print it talbe");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for(int i=1; i<=10; i++){
            result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

    }

}


Output:-

Enter the number to print it talbe
51
51 * 1 = 51
51 * 2 = 102
51 * 3 = 153
51 * 4 = 204
51 * 5 = 255
51 * 6 = 306
51 * 7 = 357
51 * 8 = 408
51 * 9 = 459
51 * 10 = 510

Process finished with exit code 0
