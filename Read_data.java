import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Read_data {
    public static void main(String[] args) {
        try {
            File file = new File("Prince.txt");
            Scanner rd = new Scanner(file);
            while(rd.hasNextLine()){
                String data = rd.nextLine();
                System.out.println(data);
            }
            rd.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    

    }
}