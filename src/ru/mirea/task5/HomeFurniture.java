package ru.mirea.task5;

public class HomeFurniture extends Furniture{
    private String comfortClass; // класс комфорта мебели

    public HomeFurniture(int weight, int height, int length, int width, String name,int price, String comfortClass){
        super(weight,height,length,width,price,name);
        this.comfortClass = comfortClass;
    }
}
