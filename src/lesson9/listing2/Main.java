package lesson9.listing2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of array: ");
        n = in.nextInt(); // присвоєння кількості елементів массиву
        a = new int[n]; // виділення памʼяті під масив
        for (int i = 0; i<n; i++){
            System.out.print("Enter a[" + i + "] = ");
            a[i] = in.nextInt();
        }

    }
}
