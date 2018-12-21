//         COSC 1337.S01
//         Lab 8
//         2015/5/7
//         Triangle.java
//---------------------------------------------------------------
public class Triangle extends Shape {
    public Triangle(){
        System.out.println("Triangle - default constructor");
    }
    @Override
    public void draw(){
        System.out.println("Triangle - draw method");
    }
    @Override
    public void move(){
        System.out.println("Triangle - move method");
    }
    @Override
    public void erase(){
        System.out.println("Triangle - erase method");
    }
}