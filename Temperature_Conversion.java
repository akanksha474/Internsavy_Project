package Internsavy_Project;
import java.util.Scanner;
public class Temperature_Conversion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Temperature Conversion Tool");
        System.out.println("----------------------------");
        System.out.println("The Choice for conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter the choice ( 1 or 2 ):");
        int choice=sc.nextInt();


        if (choice==1){
            System.out.print("Enter the temperature in Celsius:");
            double temp= sc.nextDouble();
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
        else if (choice==2) {
            System.out.print("Enter the temperature in Fahrenheit:");
            double temp= sc.nextDouble();
            double Celsius = (temp - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + Celsius);

        }
        else {
            System.out.println("Invalid choice. PLease enter 1 or 2 ");
        }

    }

}
