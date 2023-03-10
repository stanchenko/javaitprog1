package lesson22;

public interface Array {
    // в інтерфейсах немає потреби писати слово static так як тут це за замовчуванням
   // static int i = 12;  так писати не потрібно
    int z =12;
    // якщо final то треба дописувати
    final int y = 13;
    // в інтерфейсі кожен метод є абстрактним це означає що в кожному класі наслідувачі а точніше в класі реалізації
    // необхідно буде реалізовувати кожен конкретний метод який записан в цьому інтерфейсі
    //abstract int Get (int i); abstract писати не потрібно
    int Get (int i);
    boolean Add (int val);

}