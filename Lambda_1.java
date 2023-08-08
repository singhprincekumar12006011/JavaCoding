/*
Wap the lambda expression of this 
public static void {
    System.out.println("Hello Prince!");
}

 */


interface lam 
{
    void exp();
}

class Lambda_1 {
    public static void main(String[] args)
    {
        //the lambda expression is not an anonymous function
        //so it doen't have name, data type and access modifier
        //it  use -> this symbol

        lam expressiLam = () -> System.out.println("Hello Prince!");
        expressiLam.exp();
    }
}