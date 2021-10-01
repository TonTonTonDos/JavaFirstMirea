package ru.mirea.task1.opt6;

public class RandomArray {
    public static void main(String[] args) {
        int[] nums = new int[10];
        System.out.println("вывод массива случайных чисел");
        for(int i:nums) {
            i = (int) (Math.random() * 100);
            System.out.print(i + " ");
        }
    }
}
