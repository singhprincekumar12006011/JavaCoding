import java.util.*;
public class Lambda_List {
    public static void main(String[] args)
    {
        List <String> li =  new ArrayList<String>();
        li.add("Prince Singh");
        li.add("Tanu Singh");
        li.add("Nidhi Singh");
        li.add("Manish Singh");

        li.forEach(
            (n) -> System.out.print(n + ",.+ ")
        );
    }
}
