/* Shape Hierarchy:
 Create a class named Shape with a method to calculate area (abstract).
 Create subclasses for Circle, Rectangle, and Triangle inheriting from Shape.
 Implement the calculateArea() method in each subclass accordingly.
 Create an array of Shape objects and calculate the total area of all shapes.
 */


 abstract class Shape{
    abstract double calculateArea();
}
class Circle extends Shape{
    float radius;

    public Circle (float radius){
        this.radius=radius;

    }
    double calculateArea() {
        System.out.println("Area of Circle");
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape{
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    double calculateArea(){
        System.out.println("Area Of rectangle");
        return length*width;
    }
}
class Triangle extends Shape{
    int base;
    int height;


    public Triangle(int base, int height){
        this.base=base;
        this.height=height;
    }


    double calculateArea(){
        System.out.println("Area Of Triangle");
        return 0.5 * base * height;

    }
}    

public class ShapeHierarchy{
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10,5);
        shapes[2] = new Triangle(5,10);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }

    }

}
