import java.util.Scanner;

public class StringAssigmentExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the input string from the user
        String userInput = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Display the user's input
        System.out.println("The entered string is: " + userInput);
    }
}