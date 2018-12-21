//         COSC 1337.S01
//         Lab 8
//         2015/5/7
//         Square.java
//---------------------------------------------------------------
public class Square extends Rectangle {
    public Square(){
        System.out.println("Square - default constructor");
    }
    @Override
    public void draw(){
        System.out.println("Square - draw method");
    }
    @Override
    public void move(){
        System.out.println("Square - move method");
    }
    @Override
    public void erase(){
        System.out.println("Square - erase method");
    }
}