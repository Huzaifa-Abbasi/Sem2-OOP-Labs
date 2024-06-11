/*Write a program that creates two Rectangle objects (assuming you have a Rectangle class similar to 
Circle) with different widths and heights. Calculate and print the area of each rectangle.*/


import java.util.Scanner;

class Rectangle{
    double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calculate(double width, double height){
        return width * height;
    }
}


public class Rectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Width of r1: ");
        double width1 = sc.nextDouble();
        System.out.println("Enter the Height of r1: ");
        double height1 = sc.nextDouble();
        Rectangle r1 = new Rectangle(width1, height1);
        System.out.println("The area of  Rectangle 1: "+r1.calculate(width1, height1));

        System.out.println("Enter the Width: ");
        double width2 = sc.nextDouble();
        System.out.println("Enter the Height: ");
        double height2 = sc.nextDouble();
        Rectangle r2 = new Rectangle(width2, height2);

        System.out.println("The area of  Rectangle 2: "+r2.calculate(width2, height2));
    }
}