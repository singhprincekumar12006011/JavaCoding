
//Example of polymorphism using overloading.


//Creating a class 
class Sum 
{
    //creating method having parameter
    public static int sum(int x, int y){
        return x+y;
    }

    public static int sum(int x, int y, int z)
    {
        return (x+y+z);
    }

    public static double sum(double x, double y)
    {
        return (x+y);
    }

    public static void sum()
    {
        System.out.println("This is the example of  method overloading :");
    }
}

// in the class Sum, three methods are created using the name sum. 
//They are having same name but the method parameters are of different number and different size
//If the two or more method having  same name but different number of parameter and having different data types. this is knon as overloading  


public class Polymorphism_Overloading1
{
    public static void main(String[] args)
    {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10,20,30));
        System.out.println(s.sum(10.3,20.7));
        s.sum();// this will just print the statement that the method having not returning any thing.
    }
}