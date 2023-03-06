package lesson11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //методи починаються з типа int, char якщо метод нічого не повертає тоді void -це такі що мают щось вивести на екран
        int temp = metod1(3, 4);
        System.out.println(temp);

        metod2(3, 5);

        readArray();
    }

    public static int metod1(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        return result;
    }

    public static void metod2(int c, int d) {
        int result2 = 1;
        for (int j = 0; j < d; j++)
            result2 *= c;
        System.out.println(result2);
        //  metod2(2,2); //функція може викликати сама себе - це називається рекурсія
    }

    public static int[] readArray() {
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть розмірність массиву: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("введіть " + i + " елемент массиву: ");
            arr[i] = in.nextInt();}
            return arr;

    }
}
