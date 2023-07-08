//An abstract class has a construtor which prints "This is constructor of abstract class", an abstract method named 'a_method' and 
//a non-abstract method which prints "This is a normal method of abstract class". A class 'SubClass' inherits the abstract class 
//and has a method named 'a_method' which prints "This is abstract method". Now create an object of 'SubClass' and call the abstract 
//method and the non-abstract method. (Analyse the result).

abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("This is the constructor of the abstract class");
    }

    public abstract void a_method();

    public void normalMethod() {
        System.out.println("This is a normal method of the abstract class");
    }
}

class SubClass extends AbstractClass {
    public void a_method() {
        System.out.println("This is the implementation of the abstract method in the subclass");
    }
}

public class Abstraction_Aclass5 {
    public static void main(String[] args) {
        AbstractClass sub = new SubClass();
        sub.a_method();
        sub.normalMethod();
    }
}