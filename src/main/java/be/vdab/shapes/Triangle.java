package be.vdab.shapes;

public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }

	@Override
	double area() {
		System.out.println("TriangleArea");
		return 0;
	}
}
