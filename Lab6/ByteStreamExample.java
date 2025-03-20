package Lab6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\input.txt");
             FileOutputStream fos = new FileOutputStream("C:\\output.txt")) {

            int byteContent;
            while ((byteContent = fis.read()) != -1) {
                fos.write(byteContent);
            }
            System.out.println("File copied successfully using byte streams.");
        } catch (IOException e) {
            System.out.println("An error occurred during file I/O.");
            e.printStackTrace();
        }
    }
}
