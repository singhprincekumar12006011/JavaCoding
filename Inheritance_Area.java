import java.util.Scanner;

class Dimension {
    int length;
    int breadth;

    Dimension(int i, int j) {
        length = i;
        breadth = j;
    }
}

class AreaRectangle extends Dimension {
    int area; // Declare area as an instance variable

    AreaRectangle(int i, int j) {
        super(i, j);
        area = i * j; // Assign the calculated area to the instance variable
        System.out.println("Area of rectangle is " + area);
    }
}

public class Inheritance_Area {
    public static void main(String[] args) {
        int l, b;
        System.out.println("Enter the length of rectangle:");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        b = sc.nextInt();
        AreaRectangle ar = new AreaRectangle(l, b);
    }
}