// WAP to check the number is prime or not. Take the number as input from user.

import java.util.Scanner;
public class Check_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println(Logic(n));
    }

    public static boolean Logic(int num)
    {
        if(num == 1 ) {
            return false;
        } else {
            for(int i =2; i<num; i++){
                if(num % i == 0)
                {
                    return false;
                }
            }

        }
        return true;
    }


}
