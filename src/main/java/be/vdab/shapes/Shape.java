package be.vdab.shapes;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape" + name + "has an area of " + area() + " square units";
    }
    
    abstract double area();
}
