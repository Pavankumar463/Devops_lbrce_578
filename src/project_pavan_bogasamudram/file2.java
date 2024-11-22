package project_pavan_bogasamudram;

import java.io.*;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        // Stores two numbers
        double num1, num2;

        // Read input from a file (you can replace "input.txt" with the actual file path)
        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            System.out.println("Reading input from file:");

            // Take the inputs
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();

            // Read the operator
            char op = sc.next().charAt(0);
            double o = 0;

            // Perform calculation based on operator
            switch (op) {
                case '+':
                    o = num1 + num2;
                    break;
                case '-':
                    o = num1 - num2;
                    break;
                case '*':
                    o = num1 * num2;
                    break;
                case '/':
                    o = num1 / num2;
                    break;
                default:
                    System.out.println("You entered an invalid operator.");
                    return;
            }

            // Print the result
            System.out.println("The final result:");
            System.out.println(num1 + " " + op + " " + num2 + " = " + o);

            // Close the file scanner
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
