abstract class shape {
    int color ;
    int getcolor()
    {
        return color;
    }
    shape (int c)
    {
        color = c;
    }
    abstract double getArea();
}

class square extends shape {
    double side;
    square(int c , double s)
    {
        super(c);
        side = s;

    }
    double getArea()
    {
        return side*side;
    }
}
class Abstraction_Aclass1 {
    public static void main(String[] args)
    {
        square s = new square(5, 10.0);
        System.out.println(s.getArea());
    }
}