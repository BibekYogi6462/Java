package Lab6;

import java.io.PrintWriter;
import java.util.Scanner;

public class ConsoleOutputExample {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out, true);
        Scanner scanner = new Scanner(System.in);

        writer.println("Enter your name:");
        String name = scanner.nextLine();

        writer.println("Enter your age:");
        int age = scanner.nextInt();

        writer.printf("Hello, %s! You are %d years old.\n", name, age);
        
        scanner.close();
    }
}
