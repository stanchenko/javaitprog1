package lesson14;

public class Main {
    public static void main(String[] args) {
        Person vitya = new Person();
        System.out.println(vitya.height);
        vitya.say("George");


        Person vlad = new Person(120, "Vlad");
        System.out.println(vlad.height);
        System.out.println("My name is " + vlad.name);

        Person dima = new Person("Dima");
        System.out.println("My name is " + dima.name);

    }
}
