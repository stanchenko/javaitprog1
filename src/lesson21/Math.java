package lesson21;

public class Math {
    final int a = 10; // це константа і її не можно переприсвоїти
    // якщо final використати в классі то у класса не можуть бути наслідники
    // якщо final поставити в методі то його не можно буде переопреділити
   public static int x = 12;
   public static int y = 12;
    public static int summ (int a, int b) {
        //mult(2,4); таке не можно використовувати пока mult не буде мати значення static
        // статичні методи можуть взаємодіяти лише зі статичними, не можно в статичному методі використовувати не статичні
        return a +b;
    }

    public   int mult (int a, int b) {
        return  a * b;
    }
}
