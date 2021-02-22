package classes_013;

public class Main {
    public static void main(String[] args) {
        // Создаём первый экземпляр класса Cat
        Cat cat1 = new Cat();
        // Создаём второй экземпляр класса Cat
        Cat cat2 = new Cat();

        // Присваиваем полям name и color
        // Экземпляра класса Cat - cat1
        // Значения Соня, и Gray
        cat1.name = "Соня";
        cat1.color = "Grey";

        // Присваиваем полям name и color
        // Экземпляра класса Cat - cat2
        // Значения Мурка, и White
        cat2.name = "Мурка";
        cat2.color = "White";

        System.out.println("Имя первой кошки : " + cat1.name +
                ", Цвет первой кошки : " + cat1.color);
        System.out.println("Имя второй кошки : " + cat2.name +
                ", Цвет второй кошки : " + cat2.color);

        System.out.println(cat1.Speak());
    }
}




