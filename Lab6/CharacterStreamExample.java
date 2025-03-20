/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author Bibek Yogi
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\input.txt");
             FileWriter fw = new FileWriter("C:\\output.txt")) {

            int charContent;
            while ((charContent = fr.read()) != -1) {
                fw.write(charContent);
            }
            System.out.println("File copied successfully using character streams.");
        } catch (IOException e) {
            System.out.println("An error occurred during file I/O.");
            e.printStackTrace();
        }
    }
}
