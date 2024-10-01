/*Create a class named Shape with an abstract method calculateArea().
 Create subclasses for Circle, Rectangle, and Triangle implementing the 
calculateArea() method.
 Create an array of Shape objects and calculate the total area of all shapes using polymorphism.*/


abstract class Shape{
    abstract double calculateArea();

}

class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;

    }

    public double  calculateArea(){
       return radius * radius;
       
    }
}

class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return width * height;
    }
}

class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;

    }

    public double calculateArea(){
        return 0.5 *base *height;
    }
}
public class New{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1]= new Rectangle(10, 5);
        shapes[2] = new Triangle(10, 20);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
            
        }
    }
}
