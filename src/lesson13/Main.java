package lesson13;

public class Main {
    public static void main(String[] args) {
        Person vitya = new Person();

        System.out.println(vitya.height);
        vitya.height = 120;
        vitya.say("George");
        System.out.println(vitya.height);

        Person vlad = new Person();
        System.out.println(vlad.height);

    }
}
