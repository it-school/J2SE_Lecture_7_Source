package classes_001;

class Classes_001 {
    public static void main(String[] args) {
        //  Создаем переменную с именем instance, типа MyClass и присваиваем ей адрес экземпляра на куче.
        // (instance - является ссылкой на экземпляр класса MyClass построенный на куче)
        MyClass instance = new MyClass();

        // Полю field, экземпляра instance, присваиваем значение Hello world!
        instance.field = "Hello world!";

        // Выводим на экран значение поля field экземпляра instance.
        System.out.println(instance.field);

        // Вызов метода с именем Method на экземпляре instance.
        instance.Method();
    }
}