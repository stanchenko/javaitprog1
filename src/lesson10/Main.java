package lesson10;

public class Main {
    public static void main(String[] args) {
        float [][] array = new float[][] {{12.23f, 354.45f}, {12.23f, 354.45f}};

        char [][] array2 = new char[3][];
        for (int i = 0; i<array2.length; i++)
            array2[i] = new char[3];
            array2[0][0] = 'C';
        System.out.println(array2[0][0]);


    }
}
