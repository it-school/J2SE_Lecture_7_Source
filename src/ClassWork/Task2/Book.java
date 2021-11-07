package ClassWork.Task2;

import ClassWork.Task1.UkrainianAddress;

public class Book {
   Author author;
   Title title;
   UkrainianAddress publisher;
   Text text;

   public Book() {
   }

   public Book(Author author, Title title, UkrainianAddress publisher, Text text) {
      this.author = author;
      this.title = title;
      this.publisher = publisher;
      this.text = text;
   }

   @Override
   public String toString() {
      return "Book{" +
              "author=" + author +
              ", title=" + title +
              ", publisher=" + publisher +
              ", text=" + text +
              '}';
   }

   public Author getAuthor() {
      return author;
   }

   public void setAuthor(Author autor) {
      this.author = autor;
   }

   public Title getTitle() {
      return title;
   }

   public void setTitle(Title title) {
      this.title = title;
   }

   public UkrainianAddress getPublisher() {
      return publisher;
   }

   public void setPublisher(UkrainianAddress publisher) {
      this.publisher = publisher;
   }

   public Text getText() {
      return text;
   }

   public void setText(Text text) {
      this.text = text;
   }
}
