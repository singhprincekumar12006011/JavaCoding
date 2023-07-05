
//parent class
class Animal
{
    public void makeSound() 
    {
        System.out.println("The animal makes a sound.");
    }
}

//child class
class cat extends Animal{
    public void makeSound()
    {
        System.out.println("The cat quarrels.");
    }
}


 public class Inherirance_Animal {
     public static void main(String[] args) {
        Animal animal = new Animal();
        cat Cat = new cat();
        animal.makeSound();
        Cat.makeSound();   
    }
 }