package consolecalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleCalculator {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(reader.readLine());

            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(reader.readLine());

            System.out.println("Enter the operaion (+,-,*,/): ");
            String operator = reader.readLine();

            double result;
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
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error");
                    return;
            }

            System.out.println("Result: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}