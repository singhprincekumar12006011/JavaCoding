import java.util.Scanner;
class mult {
    int first;
    int second;
    mult(int f, int s)
    {
        first = f;
        second = s;
    }
}

class calmult extends mult {
    int result;
    calmult(int f, int s)
    {
        super(f, s);
        result = f * s; 
        System.out.println("The result is : " + result); 
    }

}

public class Inheritance_Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter the first number :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int num2 = sc.nextInt();
        calmult cl = new calmult(num1 , num2);
    }
    
}
