import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
public class Create_write_readfile {
    public static void main(String[] args) {
        try {
            File file = new File("KumarPrince.pdf");
            if(file.createNewFile())
            {
                System.out.println("File is created");
            } else 
            {
                System.out.println("file already exist :");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error is occurr :");
            e.printStackTrace();
        }
        try {
            FileWriter Writer = new FileWriter("KumarPrince.pdf");
            Writer.write("Hello!, How are you.");
            Writer.close();
            System.out.println("Successfully written. :");
        }
        catch (IOException e)
        {
            System.out.println("An error has occurred. :");
            e.printStackTrace();
        }
        try {
            File file = new File("KumarPrince.pdf");
            Scanner rd = new Scanner(file);
            while (rd.hasNextLine())
            {
                String data = rd.nextLine();
                System.out.println(data);
            }
            rd.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error is occurred :");
            e.printStackTrace();
        }
    }
}
