package lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int first, second = 50;
        boolean isTrue = false;
        System.out.print("Enter first number: ");
        first = num.nextInt();

        isTrue = first == 51 ? true : false;
        second = first ==51 ? 5 : 2;

        if (first >= second   || isTrue) {    //&& - i || - або
            System.out.print("Num is more than 50");
            System.out.print("\n");
        } else if (first == 45)
            System.out.println("Num is equal 45");
        else {
            System.out.println("Num is lower then " + second);
            System.out.println("programm is finish");
        }

        switch (first) {
            case 51:
                System.out.println("Num is equal 51");
                break;
            case 52:
                System.out.println("Num is equal 52");
                break;
            case 57:
                System.out.println("Num is equal 57");
                break;
            default:
                System.out.println("Num is equal something ");
        }
    }
}
