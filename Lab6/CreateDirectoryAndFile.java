package Lab6;

import java.io.File;
import java.io.IOException;

public class CreateDirectoryAndFile {
    public static void main(String[] args) {
        File dir = new File("TestDir");
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Directory created: " + dir.getName());
            } else {
                System.out.println("Failed to create directory: " + dir.getName());
                return;
            }
        } else {
            System.out.println("Directory already exists: " + dir.getName());
        }

        File file = new File(dir, "TestFile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + file.getName());
            e.printStackTrace();
        }
    }
}
