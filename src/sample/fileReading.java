package sample;


import javafx.scene.control.TextArea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReading {
    public static TextArea reading(String title,TextArea lbltxt) throws FileNotFoundException{
        Scanner sc =new Scanner(new File(title));
        while (sc.hasNext()){
            String line1 = sc.nextLine();
            lbltxt.appendText(line1+"\n");
        }
        sc.close();
        return lbltxt;
    }


}
