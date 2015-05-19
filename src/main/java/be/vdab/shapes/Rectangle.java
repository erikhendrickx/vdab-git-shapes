package be.vdab.shapes;

public class Rectangle extends Shape {
    public Rectangle(String name) {
        super(name);
    }

	@Override
	double area() {
		return 25;
	}
}
