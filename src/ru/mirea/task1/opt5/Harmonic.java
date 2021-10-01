package ru.mirea.task1.opt5;

public class Harmonic {
    public static void main(String[] args) {
        double[] harmonic = new double[10];
        for(int i = 0;i<10;i++)
            harmonic[i] = 1./(1*i+1);
        for(double i:harmonic)
            System.out.print(i + " ");
    }
}
