/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabThreeExceptionHandling;

/**
 *
 * @author Bibek Yogi
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {
    public static void main(String[] args) {
        String filename = "example.txt";
try{
    readFile(filename);    
}catch (FileNotFoundException e)
{
    System.out.println("File not found: " + filename);
    e.printStackTrace();

    
    }
}
    
public static void readFile(String filename) throws FileNotFoundException{
    
    File file = new File(filename);
    Scanner scanner = new Scanner(file);
    
    
//    Read and print the content of the file line by line
while(scanner.hasNextLine()){
    String line = scanner.nextLine();
    System.out.println(line);
}
//Close the scanner
scanner.close();
}
}

