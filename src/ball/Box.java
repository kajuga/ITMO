package ball;

import java.util.ArrayList;

public class Box extends Cylinder {

    private ArrayList<Shape> list = new ArrayList<>();
    private double availableVolume;
    // Shape[] shapes;

    public Box(double radius, double height) {
        super(radius, height);
        availableVolume = getVolume();
    }

    public boolean add(Shape shape){
        if(availableVolume >= shape.getVolume()){
            list.add(shape);
            availableVolume -= shape.getVolume();
            return true;
        } else {
            return false;
        }

    }
}
