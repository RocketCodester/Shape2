//         COSC 1337.S01
//         Lab 8
//         2015/5/7
//         Circle.java
//---------------------------------------------------------------
public class Circle extends Ellipse {
    public Circle(){
        System.out.println("Circle - default constructor");
    }
    @Override
    public void draw(){
        System.out.println("Circle - draw method");
    }
    @Override
    public void move(){
        System.out.println("Circle - move method");
    }
    @Override
    public void erase(){
        System.out.println("Circle - erase method");
    }
}