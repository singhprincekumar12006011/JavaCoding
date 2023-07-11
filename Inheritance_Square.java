import java.util.Scanner;

class Dimension {
    int side;

    Dimension(int i) {
        side = i;
    }
}

class SquArea extends Dimension {
    int area;

    SquArea(int i) {
        super(i);
        area = i * i;
        System.out.println("The area of Square is: " + area);
    }
}

public class Inheritance_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int s = sc.nextInt();

        SquArea sq = new SquArea(s);
    }
}