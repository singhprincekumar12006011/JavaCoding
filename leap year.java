//WAP to find the leap year

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        int year;
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if(year % 4 == 0 ){
            System.out.println("This is leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}