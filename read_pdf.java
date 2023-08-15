import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_pdf {
    public static void main(String[] args) {
        try{
            File file = new File("PrinceSingh.pdf");
            Scanner rd = new Scanner(file);
            while(rd.hasNextLine())
            {
                String data = rd.nextLine();
                System.out.println(data);
            }
            rd.close();
        }
        catch(FileNotFoundException e) 
        {
            System.out.println("An error is occurred :");
            e.printStackTrace();
        }
    }
}

