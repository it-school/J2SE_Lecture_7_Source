
package classes_007;

class Point {
    // Поля.
    private int x, y;
    private String name;

    // Свойства.
    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    String getName() {
        return name;
    }

    // Конструктор по умолчанию, инициализирует поля значениями по умолчанию.
    Point() {
        System.out.println("Конструктор по умолчанию!");
    }

    // Пользовательский конструктор, инициализирует поля значениями заданными пользователем.
    Point(int x, int y) {
        System.out.println("Пользовательский конструктор с двумя аргументами!");
        // ключевое слово this явно указывает на то, что переменная пренадлежит экземлляру класса
        this.x = x;
        this.y = y;
    }

    Point(String name, int x, int y) {
        // Вызов конструктора на 31 строке
        this(x, y);
        System.out.println("Пользовательский конструктор с тремя аргументами!");
        this.name = name;
    }
}
