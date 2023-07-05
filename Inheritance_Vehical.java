//Write a Java program to create a class called Vehicle 
//with a method called drive(). 
//Create a subclass called Car that overrides the drive()
// method to print "Repairing a car".



//Parent class
class Vehical
{
    public void drive()
    {
        System.out.println("This is the vehical class  ans also the parent class");
    }
}

class Car extends Vehical{
    public void drive()
    {
        System.out.println("Repairing a car");

    }
}

public class Inheritance_Vehical {
    public static void main(String[] args)
    {
        Vehical veh=new Vehical();
        Car car= new Car();
        veh.drive();
        car.drive();
    }
}
