public class Exception_2 {
    public static void main(String[] args) 
    {
        try {
            methodA();
        }
        catch (ArithmeticException ex) {
            System.out.println("Arithemetic exception caought");
            ex.printStackTrace();
        }
    }
    public static void methodA() {
        System.out.println("Enter methodA()");
        int a=5, b=0;
        int c=a/b;
        System.out.println(c);
    }
}
