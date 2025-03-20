/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

/**
 *
 * @author Bibek Yogi
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write student information to file student.txt using try-with-resources
        try (FileWriter writer = new FileWriter("student.txt")) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Enter details for student " + i + ":");
                System.out.print("Roll number: ");
                int roll = scanner.nextInt();
                
                scanner.nextLine();
                
                System.out.print("Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Address: ");
                String address = scanner.nextLine();
                
                System.out.print("College: ");
                String college = scanner.nextLine();
                
                // Write student information to file
                writer.write(roll + "," + name + "," + address + "," + college + "\n");
            }
            System.out.println("Student information written to student.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        // Read and display students whose address is 'Jhapa' from student.txt
        try (Scanner fileScanner = new Scanner(new File("student.txt"))) {
            System.out.println("\nStudents from Jhapa:");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] details = line.split(",");
                
                String roll = details[0];
                String name = details[1];
                String address = details[2];
                String college = details[3];
                
                if (address.trim().equalsIgnoreCase("Jhapa")) {
                    System.out.println("Roll: " + roll + ", Name: " + name + ", Address: " + address + ", College: " + college);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
