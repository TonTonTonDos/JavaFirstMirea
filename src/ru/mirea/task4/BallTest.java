package ru.mirea.task4;


public class BallTest {
    public static void main(String[] args) {
        Ball firstBall = new Ball(10,4);
        System.out.println(firstBall.toString());
        firstBall.setXY(0,0);
        System.out.println(firstBall.toString());
    }
}
