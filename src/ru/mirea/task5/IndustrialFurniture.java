package ru.mirea.task5;

public class IndustrialFurniture extends Furniture {
    private int wearResistance; // класс комфорта мебели

    public IndustrialFurniture(int weight, int height, int length, int width, String name,int price, int wearResistance){
        super(weight,height,length,width,price,name);
        this.wearResistance = wearResistance;
    }

}
