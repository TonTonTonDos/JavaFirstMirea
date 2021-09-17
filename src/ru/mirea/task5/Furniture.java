package ru.mirea.task5;

public abstract class Furniture {
    protected int weight;
    protected int height;
    protected int length;
    protected int width;
    protected int price;
    String name;

    protected int getWeight() {
        return weight;
    }

    protected int getHeight() {
        return height;
    }

    protected int getLength() {
        return length;
    }

    protected int getWidth() {
        return weight;
    }

    protected Furniture( int weight, int height, int length, int width,int price, String name){
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.width = width;
        this.name = name;
        this.price = price;
    }

}
