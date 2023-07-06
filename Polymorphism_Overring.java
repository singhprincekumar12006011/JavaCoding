/*
  
The Base class is defined with a method fun(), which simply outputs "Base's fun" when called.

The Derived class extends the Base class using the extends keyword, indicating that Derived is a subclass of Base.
 The Derived class overrides the fun() method from the Base class by using the @Override annotation. 
 The overridden method in the Derived class outputs "Derived's fun" when called.

The Polymorphism_Overriding class contains the main method. Inside the main method, an instance of the Derived class named b is 
created and assigned to a variable of type Base. This is possible because a reference of the base class can point to an object of its derived class, which demonstrates polymorphism.

The fun() method is called on the b object using the dot notation (b.fun()). 
Since the object is of type Derived and the reference type is Base, the fun() method of the Derived class is invoked. 
This is an example of runtime polymorphism, where the actual method called is determined at runtime based on the type of the object.

 */


class Base {
    void fun()
    {
        System.out.println("Base's fun");
    }
}

class Derived extends Base {
    @Override
    void fun()
    {
        System.out.println("Derived's fun");
    }

}

public class Polymorphism_Overring {
    public static void main(String[] args)
    {
        Base b = new Derived();
        b.fun();
    }  
}
