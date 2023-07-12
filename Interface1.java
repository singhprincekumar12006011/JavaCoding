interface Printable {
    void print();
}

class My_class implements Printable {
    public void print() {
        System.out.println("Hi Prince");
    }
}

public class Interface1 {
    public static void main(String[] args)
    {
        My_class m = new My_class();
        m.print();
    }
    
}
