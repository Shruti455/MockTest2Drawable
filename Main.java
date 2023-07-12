// Interface Drawable
interface Drawable {
    void draw();
}

// Class Circle implementing Drawable
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
        // Implementation specific to drawing a circle
    }
}

// Class Rectangle implementing Drawable
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
        // Implementation specific to drawing a rectangle
    }
}

// Main program
public class Main {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Calling draw() method on each object
        circle.draw();
        rectangle.draw();
    }
}
