package ball;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return 4d / 3 * Math.PI * Math.pow(getRadius(), 3);
    }
}
