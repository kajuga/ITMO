package ball;

public class SolidRevolutionForFunction extends SolidOfRevolution {

    private Function function;
    private double a;
    private double b;

    public SolidRevolutionForFunction(double radius, Function function, double a, double b) {
        super(radius);
        this.function = function;
        this.a = a;
        this.b = b;
    }

    @Override
    public double getVolume() {
        double sum = 0;
        for(int i = 0; i < 100; i++){
            sum += Math.pow(function.apply(a + ((b - a) * i/100)), 2);
        }

        return sum;
    }


}
