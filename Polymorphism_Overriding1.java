
class Animal 
{
    public  void makeSound ()
    {
        
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override

    public  void makeSound()
    {
        System.out.println("Dog barks:");
    }
}

public class Polymorphism_Overriding1 {
 
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.makeSound();
    }
}


/* 
 
The Animal class is defined with a single method makeSound(). This method simply prints "Animal makes a sound" to the console.

The Dog class extends the Animal class. It overrides the makeSound() method with its own implementation. The overridden method in the Dog class prints "Dog barks" to the console.

The Polymorphism_Overriding1 class is the main class that contains the main() method.

Inside the main() method:

An object animal of the Animal class is created using the new keyword.
The makeSound() method is called on the animal object.
When the code is executed:

The animal.makeSound() statement invokes the makeSound() method on the animal object.
Since the animal object is an instance of the Animal class, the makeSound() method defined in the Animal class is called.
As a result, the output will be:
Animal makes a sound



In this code, the concept of method overriding is demonstrated. 
The Dog class overrides the behavior of the makeSound() method inherited from the Animal class, providing its own implementation. 
This illustrates polymorphism, where an object of a derived class (Dog) is treated as an object of its superclass (Animal).


 */