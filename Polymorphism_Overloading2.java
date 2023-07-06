

//calculating the multiplication of number of different data types. 

class Multiply
{
    public static int mult(int x,  int y)
    {
        return (x*y);
    }

    public static double mult(double x, double y)
    {
        return (x * y);
    }
}

public class Polymorphism_Overloading2 {
    public static void main(String[] args)
    {

        // creating the instance of parent class 
        Multiply mlt = new Multiply();

    //calling the method.
    //The method are having the same name so,  when we call the method . based  on the parameter method are called. 
    System.out.println(mlt.mult(6,3));
    System.out.println(mlt.mult(4.3, 3.3));
    }
    
}
