abstract class Shape{
    public abstract String calculateArea();
}

class Rectangle extends Shape{
    @Override
    public String calculateArea() {
        float length = 40.56F, breadth = 30.67F;
        return ("The area of Rectangle is: " + length * breadth);
    }
}

class Circle extends Shape{
    @Override
    public String calculateArea() {
        float pi = 3.14F, radius = 3;
        return ("The area of Circle is: " + pi * radius * radius);
    }
}

class Triangle extends Shape{
    @Override
    public String calculateArea() {
        float base = 13, height = 8;
        return ("The area of Triangle is: " + (float)1/2 * base * height);
    }

}

class ShapeCalculator{

    public void printArea(Shape shape){

        System.out.println(shape.calculateArea());
    }

}


public class Two {

    public static void main(String[] args) {

        ShapeCalculator s = new ShapeCalculator();

        s.printArea(new Rectangle());
        s.printArea(new Circle());
        s.printArea(new Triangle());

    }
}
