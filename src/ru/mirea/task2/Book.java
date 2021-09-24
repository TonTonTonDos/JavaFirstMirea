package ru.mirea.task2;
import java.util.Scanner;

public class Book {
    private String author;
    private String name;
    private String date;
    private String publisher;

    public String getAuthor(){
        return author;
    }

    public String getName(){
        return name;
    }

    public String getDate(){
        return date;
    }

    public String getPublisher(){
        return publisher;
    }

    public Void setAuthor(){
        Scanner in = new Scanner(System.in);
        author= in.nextLine();
        in.close();
        return null;
    }

    public Void setName(){
        Scanner in = new Scanner(System.in);
        name= in.nextLine();
        in.close();
        return null;
    }

    public Void setDate(){
        Scanner in = new Scanner(System.in);
        date= in.nextLine();
        in.close();
        return null;
    }

    public Void setPublisher(){
        Scanner in = new Scanner(System.in);
        publisher= in.nextLine();
        in.close();
        return null;
    }
}
