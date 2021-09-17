package ru.mirea.task5;

public class Main {
    public static void main(String[] args) {
        FurnitureShop main_shop = new FurnitureShop();

        HomeFurniture sofaUsual = new HomeFurniture(125, 65, 150, 200, "Big Sofa", 599, "Usual Extra");
        HomeFurniture bed = new HomeFurniture(100, 65, 200, 200, "Bed", 249, "Economy");
        HomeFurniture wardrobe = new HomeFurniture(200, 250, 300, 200, "Wardrobe Elite", 9999, "Like Trump");
        IndustrialFurniture table = new IndustrialFurniture(200, 250, 300, 200, "Durable Table", 9999, 590);

        main_shop.setAssortment(sofaUsual);
        main_shop.setAssortment(bed);
        main_shop.setAssortment(wardrobe);
        main_shop.setAssortment(table);
        main_shop.getAllAssortment();
    }
}
