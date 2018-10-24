package ball;

public class MyFunction extends Function {
    @Override
    public double apply(double x) {
        return Math.cos(x) * Math.log10(x);
    }
}
