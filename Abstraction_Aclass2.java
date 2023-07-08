
//Create an abstract class 'Parent' with a method 'message'. 
//It has two subclasses each having a method with the same name 'message' that prints
// "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.


abstract class Parent {
    public abstract void message();
}

class FirstSubclass extends Parent {
    public void message() {
        System.out.println("This is the first subclass");
    }
}

class SecondSubclass extends Parent {
    public void message() {
        System.out.println("This is the second subclass");
    }
}

public class Abstraction_Aclass2 {
    public static void main(String[] args) {
        FirstSubclass first = new FirstSubclass();
        first.message(); // Output: This is the first subclass

        SecondSubclass second = new SecondSubclass();
        second.message(); // Output: This is the second subclass
    }
}