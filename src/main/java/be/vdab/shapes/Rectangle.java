package be.vdab.shapes;

public class Rectangle extends Shape {
    public Rectangle(String name) {
        super(name);
    }

	@Override
	double area() {
		System.out.println("RectangleArea");
		return 0;
	}
}
