//         COSC 1337.S01
//         Lab 8
//         2015/5/7
//         ShapeTest.java
//---------------------------------------------------------------
public class ShapeTest {
    public static void main (String args[]){
        Shape s1 = new Shape();
        Rectangle r1 = new Rectangle();
        Square sq1 = new Square();
        Ellipse e1 = new Ellipse();
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();
        Shape [] z = {r1,sq1,e1,c1,t1};
        for (Shape z1 : z) {
            z1.draw();
            z1.move();
            z1.erase();
        }
        /*Verify that All of the shape methods are
        called once for each of the shape types*/
        
    }
}