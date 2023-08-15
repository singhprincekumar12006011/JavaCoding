import java.io.File;

import java.io.IOException;

import javafx.scene.effect.Light.Spot;

public class Create_file {
    public static void main(String[] args) {
        
        try {
            File obj = new File("myFile.txt");
            if(obj.createNewFile()) {
                System.out.println("File is created : "+ obj.getName());

            }
            else{
                System.out.println("File already exists");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error is occured :");
            e.printStackTrace();
        }
    }
}