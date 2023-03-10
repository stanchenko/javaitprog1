package lesson22;

public class Main {
    public static void main(String[] args) {

        // інтерфейс це клас в якому всі методи та поля будуть static або/і final a всі методи будуть абстрактним і
        // інтерфейс використовується для того, щоб показати що буде відбуватись в класі но не реалізовувати це
        // може бути один інтерфейс потім кілька класів які реалізують цей інтерфейс і відповідно функціонал в цих класах (ті ж методи по суті теж саме)
        // вони будуть відрізнятись від класа до класу

        //створюємо обʼєкт інтерфейса
        Array a = new MyArray(); //Array - інтерфейс MyArray - клас який реалізує цей інтерфейс
        System.out.println(a.Add(3));
        System.out.println(a.Add(23));
        System.out.println(a.Add(34));
        System.out.println(a.Add(7));
        System.out.println(a.Add(8));
        System.out.println(a.Get(4));

        System.out.println("");

        Array b = new Array_1();
        System.out.println(b.Add(3));
        System.out.println(b.Add(23));
        System.out.println(b.Add(34));
        System.out.println(b.Add(7));
        System.out.println(b.Get(2));

    }


}
