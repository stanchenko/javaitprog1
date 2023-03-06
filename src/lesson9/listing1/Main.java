package lesson9.listing1;

public class Main {
    public static void main(String[] args) {
        //  int[] name; //створили массив
        //   name = new int[5]; // виділили памʼять під массив
        int [] name = new int[5]; // більш звичний запис, повна ініціалізація массива
        name[0] = 23; // назначили значення для для ел массива
        System.out.println(name[0]);

        int [] name2 = new int[] {23,34,45};
        System.out.println(name2[1]);

        float[] name3 = new float[] {23.25f, 34.12f, 35.44f};
        System.out.println(name3[1]);

    }
}
