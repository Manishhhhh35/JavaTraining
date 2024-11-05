package Firstlearningtutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {

        try {
            FileInputStream fs= new FileInputStream("C:/Users/demo.txt");
            int c=  fs.read();
            System.out.println((char) c);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
