/*Circle_Radiusate a class named Shape with a member variable for color (default: "black"). Create a subclass 
named Circle that inherits from Shape and has a member variable for radius. Implement a method 
in Circle to calculate the area (π * radius^2).*/


class Shape{
    String colour;
}
class Circle extends Shape{
    double radius;

    public double calculate(double radius){
        double area = 3.14 * radius*radius;
        System.out.println("The Radius is: " + radius);
        System.out.println("The Area is: " + area);
        return (area);
    }
}


public class Circle_Radius {
    public static void main(String[] args) {
        Circle ci = new Circle();
        double radius = 209987.38898997;
        ci.calculate(radius);

    }
}