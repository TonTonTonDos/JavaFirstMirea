package ru.mirea.task3.op1;

public class Circle {
    private float radius;
    public Circle(float radius){
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public float P(){
        return(2*3.14f*radius);
    }
    public float S() {
        return (3.14f * radius * radius);
    }
}
