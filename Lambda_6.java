public class Lambda_6 {
    public static void main(String[] args) {
        Runnable lam = () -> {
            System.out.println("This is lambda program");
        };
        lam.run();
    }
}
