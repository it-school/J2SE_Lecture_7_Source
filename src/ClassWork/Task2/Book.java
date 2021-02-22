package ClassWork.Task2;

import ClassWork.Task1.UkrainianAddress;

public class Book
{
    @Override
    public String toString()
    {
        return "Book{" +
                "autor=" + autor +
                ", title=" + title +
                ", publisher=" + publisher +
                ", text=" + text +
                '}';
    }

    public Book()
    {
    }

    public Book(com.itschool.Classes.Task2.Author autor, com.itschool.Classes.Task2.Title title, UkrainianAddress publisher, Text text)
    {
        this.autor = autor;
        this.title = title;
        this.publisher = publisher;
        this.text = text;
    }

    public com.itschool.Classes.Task2.Author getAutor()
    {
        return autor;
    }

    public void setAutor(com.itschool.Classes.Task2.Author autor)
    {
        this.autor = autor;
    }

    public com.itschool.Classes.Task2.Title getTitle()
    {
        return title;
    }

    public void setTitle(com.itschool.Classes.Task2.Title title)
    {
        this.title = title;
    }

    public UkrainianAddress getPublisher()
    {
        return publisher;
    }

    public void setPublisher(UkrainianAddress publisher)
    {
        this.publisher = publisher;
    }

    public Text getText()
    {
        return text;
    }

    public void setText(Text text)
    {
        this.text = text;
    }

    com.itschool.Classes.Task2.Author autor;
    com.itschool.Classes.Task2.Title title;
    UkrainianAddress publisher;
    Text text;
}
