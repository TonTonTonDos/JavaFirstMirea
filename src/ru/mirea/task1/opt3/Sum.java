package ru.mirea.task1.opt3;

public class Sum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
            sum+=nums[i];
        System.out.println("Сумма, посчитанная с помощью \"for\" равна " + sum);

        sum = 0;
        int c = 0;
        while (c < nums.length){
            sum+=nums[c];
            c++;
        }
        System.out.println("Сумма, посчитанная с помощью \"while\" равна " + sum);

        c= sum = 0;
        do {
            sum+=nums[c];
            c++;
        } while (c < nums.length);
        System.out.println("Сумма, посчитанная с помощью \"do while\" равна " + sum);

    }
}
