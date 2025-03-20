/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author Bibek Yogi
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to map student names to their grades
        HashMap<String, String> studentGrades = new HashMap<>();

        // Add entries to the HashMap
        studentGrades.put("Bibek", "A");
        studentGrades.put("Rosey", "B");
        studentGrades.put("Samarpan", "C");
        studentGrades.put("Ritu", "B");
        studentGrades.put("Evan", "A");

        // Retrieve and print the grade for a specific student
        String student = "Evan";
        String grade = studentGrades.get(student);
        System.out.println("Grade for " + student + ": " + grade);

        // Iterate through the HashMap and print all entries
        System.out.println("All student grades:");
        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}

