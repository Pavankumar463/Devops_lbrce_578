package project_pavan_bogasamudram;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class cal {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            double result = 0.0;
            double num1 = 0.0, num2 = 0.0;
            String operator = "";

            // Read numbers and operator from input
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
            }

            while (scanner.hasNext()) {
                operator = scanner.next(); // Read the operator

                if (scanner.hasNextDouble()) {
                    num2 = scanner.nextDouble(); // Read the second number
                }

                // Perform calculation based on operator
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        return;
                }

                num1 = result; // Store the result to use in the next operation if any
            }

            System.out.println("Final Result: " + result);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
