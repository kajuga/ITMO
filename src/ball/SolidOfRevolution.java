package ball;

abstract public class SolidOfRevolution extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }
}
