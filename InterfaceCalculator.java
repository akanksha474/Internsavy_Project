package Internsavy_Project;
import java.util.Scanner;
interface Calculator {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}
class BasicCalculator implements Calculator {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
}
public class InterfaceCalculator {
    public static void main(String[] args) {

        Calculator calculator = new BasicCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = calculator.divide(num1, num2);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

