package classes_002;

class Classes_002 {
    public static void main(String[] args) {
        //  Создаем переменную с именем instance, типа MyClass и присваиваем ей адрес экземпляра класса MyClass на куче.
        // (instance - является ссылкой на экземпляр класса MyClass построенный на куче)
        MyClass instance = new MyClass();

        instance.setField("Hello world!");     // Метод-мутатор

        String str = instance.getField();  // Метод-аксессор

        System.out.println(str);
    }
}