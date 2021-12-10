package ru.mirea.task2.op1;

public class BookTest {

    public static void main(String[] args) {
        Book mathematics = new Book();
        System.out.print("Введите имя автора\n");
        mathematics.setAuthor();
        System.out.print(mathematics.getAuthor());
    }
}