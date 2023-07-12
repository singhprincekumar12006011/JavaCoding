//creating an interface 
interface MyInt {
    default void fun1()
    {
        System.out.println("fun1");
    }
    static void fun2()
    {
        System.out.println("fun2");
    }

    //abstract method.
    void fun3();
}


//this is not an abstract class.
class Interface2 implements MyInt {

    // to make the class  to be concrete class the abstract method of a override.
    public void fun3() {
        System.out.println("fun3");
    }

    public static void main(String[] args)
    {

        Interface2 i = new Interface2();
        i.fun1();
        MyInt.fun2();
        i.fun3();
    }
    
}
