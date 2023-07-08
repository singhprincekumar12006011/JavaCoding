//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects
// (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited 
//by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The 
//constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters 
//for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.

abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;

    public A(int subject1Marks, int subject2Marks, int subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    public double getPercentage() {
        int totalMarks = subject1Marks + subject2Marks + subject3Marks;
        return (totalMarks / 3.0); // Assuming equal weightage for all three subjects
    }
}

class B extends Marks {
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;
    private int subject4Marks;

    public B(int subject1Marks, int subject2Marks, int subject3Marks, int subject4Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
    }

    public double getPercentage() {
        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks;
        return (totalMarks / 4.0); // Assuming equal weightage for all four subjects
    }
}

public class Abstraction_Aclass4 {
    public static void main(String[] args) {
        A studentA = new A(80, 75, 90);
        System.out.println("Percentage of marks obtained by Student A: " + studentA.getPercentage() + "%");

        B studentB = new B(85, 70, 92, 88);
        System.out.println("Percentage of marks obtained by Student B: " + studentB.getPercentage() + "%");
    }
}