import java.util.*;
class School 
{
    String std_name;
    String school_name;
}
class student extends School
{
    public void  sch_name()
    {
        System.out.println("School name :- " + school_name);
    }  
    void fun()
    {
        System.out.println("The name of student is " + std_name);
    }
}

public class Inheritance_Type_Single {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        System.out.println("Enter the name of School:");
        s1.school_name=sc.nextLine();
        System.out.println("Enter the name of student:");
        s1.std_name = sc.nextLine();
        

        //calling the methods 
        s1.sch_name();
        s1.fun();

    }
}
