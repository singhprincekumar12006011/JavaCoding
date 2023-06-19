// WAP to find the sum of an element of an array. Take the element of an array as input from user.





import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args)
    {
        int number[] = new int[5];
        int sum=0;
        System.out.println("Enter the 1st element of an element :");
        Scanner sc=new Scanner(System.in);
        number[0]=sc.nextInt();
        System.out.println("Enter the 2nd element");
        number[1]=sc.nextInt();
        System.out.println("Enter the 3rd element");
        number[2]=sc.nextInt();
        System.out.println("Enter the 4th element");
        number[3]=sc.nextInt();
        System.out.println("Enter the 5th element");
        number[4]=sc.nextInt();
        for(int i=0; i<number.length; i++)
        {
            System.out.println(number[i]);
        }

        for(int i=0; i<number.length; i++)
        {
            sum += number[i];
        }
        System.out.println(sum);
    }
}
