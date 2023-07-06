import java.util.Scanner;

public class Inheritance_Square {
    public static void main(String[] main) {
        int x; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square:");
        x = sc.nextInt();
        Area ar = new Area(x);
    }
}

class Dimension {
    int length;

    Dimension(int l) {
        length = l;
    }
}

class Area extends Dimension {
    int area;
    int perimeter;

    Area(int l) {
        super(l);
        area = l * l;
        perimeter = 4 * l;
        System.out.println("Area of square: " + area);
        System.out.println("Perimeter of square: " + perimeter);
    }
}