package classes_008;

class MyClass2 {
    // На 6 строке создаем метод с именем CallMethod,
    // который принимает один аргумент типа MyClass и ничего не возвращает
    void CallMethod(MyClass my) {
        // В теле метода CallMethod, на 21 строке вызываем метод с именем Method аргумента my
        my.Method();
    }
}
