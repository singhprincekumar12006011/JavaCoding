
import java.io.File;
import java.io.IOException;
public class Create_pdf {
    public static void main(String[] args) {
        try {
            File file = new File("PrinceSingh.pdf");
            if(file.createNewFile())
            {
                System.out.println("File is created : ");
            }

            else {
                System.out.println("File is already exist :");
            }

        }
        catch(IOException e) 
        {
            System.out.print("An error is occurred : ");
        }
    }
}
