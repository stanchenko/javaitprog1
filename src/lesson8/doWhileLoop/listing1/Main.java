package lesson8.doWhileLoop.listing1;

public class Main {
    public static void main(String[] args) {

        boolean isTrue = true;
        int j = 11;

       do { //різниця із for у тому що можно використовувати буліан змінні
           // цикл буде виконаний хоча б один раз
           System.out.println(j);
           j +=2;
           if (j >10)
               isTrue = false;
       }
        while (isTrue);
    }
}
