package classes_013;

public class Main {
   public static void main(String[] args) {
      // Создаём первый экземпляр класса Cat
      Cat cat1 = new Cat();
      // Создаём второй экземпляр класса Cat
      Cat cat2 = new Cat();

      // Присваиваем полям name, color, temperature
      // Экземпляра класса Cat - cat1
      // Значения Соня, Gray, 70
      //cat1.name = "Соня";
      cat1.setName("Соня");
      cat1.setColor("Grey");
      cat1.setTemperature(70);

      // Присваиваем полям name, color, temperature
      // Экземпляра класса Cat - cat2
      // Значения Мурка, White, 38
      cat2.setName("Мурка");
      cat2.setColor("White");
      cat2.setTemperature(38);

      System.out.println("Имя первой кошки : " + cat1.getName() + ", Цвет первой кошки : " + cat1.getColor() + ", temp = " + cat1.getTemperature());
      System.out.println(cat1.Speak());

      System.out.println("Имя второй кошки : " + cat2.getName() + ", Цвет второй кошки : " + cat2.getColor() + ", temp = " + cat2.getTemperature());
      System.out.println(cat2.Speak());

      // Создаём объект с помощью конструктора с параметрами
      Cat cat3 = new Cat("Grey", "gray", 38);
      // Выводим полную информацию о нём используя строковое представление объекта toString()
      System.out.println(cat3);
   }
}