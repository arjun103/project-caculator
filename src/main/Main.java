package main;
import sourse_codes.Calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Write two numbers and +, -, *, /, or % sign");
            char operator;
            double num1;
            double num2;
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            operator = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.makeCalculation(num1, num2, operator);
        }
        catch (InputMismatchException ime)
        {
            System.out.println("Invalid input");
        }
    }
}
