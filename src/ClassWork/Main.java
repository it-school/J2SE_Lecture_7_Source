package ClassWork;

import ClassWork.Task0.User;
import ClassWork.Task1.Address;
import ClassWork.Task1.UkrainianAddress;
import ClassWork.Task2.Author;
import ClassWork.Task2.Book;
import ClassWork.Task2.Text;
import ClassWork.Task2.Title;
import ClassWork.Task3.Figure;
import ClassWork.Task3.Point;

public class Main {
   public static void main(String[] args) {
      User user = new User();
      user.setLogin("user");
      user.setPassword(" Pa$$w0rd ");
      user.setRegistrationDate(2021, 2, 22);
      //	System.out.println(user.getLogin() + "\t" + user.getPassword() + "\t" + user.getRegistrationDate());
      System.out.println(user);

      User user2 = new User("login", "Pa$$w0rd", 2020, 11, 16);
      System.out.println(user2);


      // task1
      System.out.println("\nTask 1\n");
      Address address = new Address(65000, "Ukraine", "oDESSA", "Shevchenko av.", "1", "");
      System.out.println(address);

      UkrainianAddress ukrainianAddress1 = new UkrainianAddress("65055", "Ukraine", "Odessa", "Shevchenko", "3", 223);
      System.out.println(ukrainianAddress1);

      UkrainianAddress ukrainianAddress2 = new UkrainianAddress("65074", "Odessa", "Ac.Filatov st.", "31", 34);
      System.out.println(ukrainianAddress2);


      // task2
      System.out.println("\nTask 2\n");
      Book book1 = new Book(new Author("Jack", "London"), new Title("Sea wolf"), ukrainianAddress2, new Text("Once upon a time..."));

      Book book2 = new Book();
      Author author = new Author("Jack", "London");
      Title title = new Title("White silence");
      Text text = new Text("In the last century...");
      book2.setAuthor(author);
      book2.setTitle(title);
      book2.setPublisher(ukrainianAddress1);
      book2.setText(text);

      System.out.println(book1);
      System.out.println(book2);


      // task3
      System.out.println("\nTask 3\n");
      Point p1 = new Point(1, 2, "A");
      Point p2 = new Point(1, 3, "B");
      Point p3 = new Point(2, 3, "C");

      Figure triangle = new Figure(p1, p2, p3);
      System.out.println(triangle);

      Figure quadrangle = new Figure(p1, p2, p3, new Point(4, 3, "D"));
      System.out.println(quadrangle);

      Point p4 = new Point(4, 5, "F");
      Point p5 = new Point(14, 5, "K");
      Figure pentagon = new Figure(p1, p2, p3, p4, p5);
      System.out.println(pentagon);
   }
}