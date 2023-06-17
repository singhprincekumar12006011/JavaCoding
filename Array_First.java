//WAP to print the element of an array, take the element of an array as input from the user.


import java.util.Scanner;

public class Array_First {
    public static void main(String[] args){
        int a[];
        a= new int[3];

        System.out.println("Enter the first element of an array");
        Scanner sc =  new Scanner(System.in);
        a[0] = sc.nextInt();
        System.out.println("Enter the second element of an array");
        a[1] = sc.nextInt();
        System.out.println("Enter the thirs element of an array");
        a[2]= sc.nextInt();

        for(int i=0; i< a.length; i++){
            System.out.println(a[i]);
        }

    }


}