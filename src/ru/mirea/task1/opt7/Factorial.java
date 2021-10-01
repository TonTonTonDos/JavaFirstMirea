package ru.mirea.task1.opt7;
import java.util.*;

public class Factorial {
    private Stack<Integer> nums = new Stack();
    public void factorial(int n){
        nums.push(1);
        int i = 2;
        int tmp;
        while(i != n+1) {
            nums.push(nums.pop() * i);
            i++;
        }
        System.out.println(nums.peek());

    }
    public static void main(String[] args) {
        Factorial first = new Factorial();
        Scanner in = new Scanner(System.in);
        first.factorial(in.nextInt());
    }
}
