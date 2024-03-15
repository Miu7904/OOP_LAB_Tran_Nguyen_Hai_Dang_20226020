package week1;
import java.util.Scanner;
public class lab_2_2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        input.close();
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
        double difference = num1 - num2;
        System.out.println("Difference: " + Math.abs(difference));
        double product = num1 * num2;
        System.out.println("Product: " + product);
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
