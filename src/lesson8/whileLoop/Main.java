package lesson8.whileLoop;

public class Main {
    public static void main(String[] args) {

        boolean isTrue = true;
        int j = 0;
        while (j <100) {
            j +=1;
            if (j % 2 == 0)
                continue;
            System.out.println(j);
        }


                //isTrue = false; замість цієї використовуємо оператор break
                // break   замість break можно використати оператор return результат той самий - частіше використовують у методах
                // пропускає одну ітерацію


    }
}
