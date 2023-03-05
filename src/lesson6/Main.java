package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        float num1, num2, plus, minus, multiplication, devision, remainder;
        System.out.print("Enter first num: ");
        num1 = num.nextFloat();
        System.out.print("Enter second num: ");
        num2 = num.nextFloat();
        plus = num1 + num2;
        minus = num1 - num2;
        multiplication = num1 * num2;
        devision = num1 / num2;
        remainder = num1 % num2;
        multiplication += 2;
        minus--; // зменшення на 1

        System.out.println("Result for operation plus = " + plus);
        System.out.println("Result for operation minus = " + minus);
        System.out.println("Result for operation multiplication = " + multiplication);
        System.out.println("Result for operation devision = " + devision);
        System.out.println("Result for operation remainder = " + remainder);
    }
}
