/* 
WAP to find to take the marks as input from the user, calculte the total and percentage and also find the grade of according to the marks.
*/





import java.util.Scanner;

public class MarksCalculator {
    public MarksCalculator() {
    }

    public static void main(String[] args) {
        System.out.println("Enter the Marks of asked subject");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Maths:");
        double math = sc.nextDouble();
        System.out.println("Enter the marks of Science:");
        double Science = sc.nextDouble();
        System.out.println("Enter the marks of English:");
        double english = sc.nextDouble();
        System.out.println("Enter the marks of Computer:");
        double computer = sc.nextDouble();
        System.out.println("Enter the marks of Hindi");
        double hindi = sc.nextDouble();
        double totalMarks = math + Science + english + computer + hindi;
        double percentage = totalMarks * 0.2;
        System.out.println("**********************************************************************");
        System.out.println("Maths = " + math);
        System.out.println("Science = " + Science);
        System.out.println("Hindi = " + hindi);
        System.out.println("Computer = " + computer);
        System.out.println("English = " + english);
        System.out.println("Your total marks is = " + totalMarks);
        System.out.println("Your percentage is " + percentage);
        Grade(percentage);
    }

    public static void Grade(double score) {
        if (score > 90.0) {
            System.out.println("your grade is A");
        } else if (score >= 80.0) {
            System.out.println("Your grade is B");
        } else if (score >= 60.0) {
            System.out.println("Your grade is C");
        } else if (score >= 40.0) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("You are fail");
        }

        System.out.println("**********************************************************************");
    }
}

