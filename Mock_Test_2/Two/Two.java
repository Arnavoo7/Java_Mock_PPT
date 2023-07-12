import java.util.Scanner;

interface Shape{
    String calculateArea();
}

class Rectangle implements Shape{

    float length, breadth;

    Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public String calculateArea(){
        return("The Area of Rectangle is: " + length * breadth);
    }

}

class Circle implements Shape{

    final float pi = 3.14F;
    float radius;

    Circle(float radius){
        this.radius = radius;
    }
    public String calculateArea(){
        return("The Area of Circle is: " + pi * radius * radius);
    }

}

class Triangle implements Shape{

    float base, height;

    Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }
    public String calculateArea(){
        return("The Area of Triangle is: " + ((float)1/2 * base * height));
    }

}

class ShapeCalculator{
    void printArea(Shape shape){
        System.out.println(shape.calculateArea());
    }
}


public class Two {
    public static void main(String[] args) {
        ShapeCalculator s = new ShapeCalculator();
        Scanner sc = new Scanner(System.in);

        //Rectangle
        System.out.print("Enter length of Rectangle: ");
        float l = sc.nextFloat();
        System.out.print("Enter breadth of Rectangle: ");
        float b = sc.nextFloat();
        s.printArea(new Rectangle(l,b));

        //Circle
        System.out.print("\nEnter radius of Circle: ");
        float r = sc.nextFloat();
        s.printArea(new Circle(r));

        //Triangle
        System.out.print("\nEnter base of Triangle: ");
        float base = sc.nextFloat();
        System.out.print("Enter height of Triangle: ");
        float height = sc.nextFloat();
        s.printArea(new Triangle(base,height));
    }
}
