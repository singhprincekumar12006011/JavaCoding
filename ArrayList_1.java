
import java.util.*;
public class ArrayList_1 {
    public static void main(String[] args)
    {
        ArrayList <String>  Arr = new ArrayList<String>();
        String fir,sec,thr,four;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Name :");
        fir=sc.nextLine();
        sec=sc.nextLine();
        thr=sc.nextLine();
        four=sc.nextLine();
        System.out.println("You have enter the names :");
        Arr.add(fir);
        Arr.add(sec);
        Arr.add(thr);
        Arr.add(four);
        System.out.println("The ArrayList is "+ "\n"+Arr);
    }
}