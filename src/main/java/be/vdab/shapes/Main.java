package be.vdab.shapes;

/**
 * Exercise:
 *  - Organise yourselves in teams of two members
 */
public class Main {
    private static Shape[] shapes = {
        new Rectangle("Rectangle one"),
        new Triangle("Triangle one")
    };

    public static void main(String[] args) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
