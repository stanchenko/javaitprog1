package lesson22;

public class MyArray implements Array {
    // клас буде реалізовувати інтерфейс Array
    // якщо клас реалізовує інтерфейс то треба писати слова implements та імʼя інтерфейсу
    int a[] = new int[50]; // розмірність 50 елементів
    int size = 0;

   // @Override // означає що ми переписуємо метод і відповідно його реалізуєм

    @Override
    public int Get(int i) {
        return a[i];
    }

    @Override
    public boolean Add(int val) {
        if (size !=a.length){
            a[size] = val;
            size++;
            return true;
        } else
            return false;
    }
}
