interface Drawable{
    void draw();
}

class Circle1 implements  Drawable{
    public void draw(){
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle1 implements  Drawable{
    public void draw(){
        System.out.println("Drawing a Rectangle.");
    }
}

public class Four {
    public static void main(String[] args) {

        //Creating objects
        Drawable c = new Circle1();
        Drawable r = new Rectangle1();

        //Calling draw method
        c.draw();
        r.draw();
    }
}
