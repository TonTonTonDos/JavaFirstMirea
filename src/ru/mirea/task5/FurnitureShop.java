package ru.mirea.task5;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList <HomeFurniture> catalogOfHomeFurniture= new ArrayList<>();
    private ArrayList <IndustrialFurniture> catalogOfIndustrialFurniture= new ArrayList<>();

    public void callAssistant(){
        System.out.println("I'm coming!");
    }

    public void setAssortment(HomeFurniture furniture){
        catalogOfHomeFurniture.add(furniture);
    }

    public void setAssortment(IndustrialFurniture furniture){
        catalogOfIndustrialFurniture.add(furniture);
    }

    public void getAllAssortment(){
        System.out.println("Catalog of home furniture: ");
        for(HomeFurniture item:catalogOfHomeFurniture )
            System.out.println("    " + item.name + ' ');
        System.out.println("Catalog of industrial furniture: ");
        for(IndustrialFurniture item:catalogOfIndustrialFurniture)
            System.out.println("    " + item.name + ' ');
    }
}
