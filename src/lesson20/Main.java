package lesson20;

public class Main {

    public static int summ(int a, int b) {
        return a+b;
    }

    public static int summ(int a, int b, int g) {
        return a+b+g;
    }

    public static float summ(float a, float b, float g) {
        return a+b+g;
    }

    public static void main(String[] args) {
        System.out.println("Результат методу з двома змінними = " + summ(23, 12));
        System.out.println("Результат методу з трьома змінними = " + summ(23, 12, 50));
        System.out.println("Результат методу з трьома змінними типу float = " + summ(23.12f, 12.45f, 50.82f));
    }


}
