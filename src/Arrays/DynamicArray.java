package Arrays;

import java.util.Arrays;

public class DynamicArray<E> {
    double values[] = new double[10];
    int size = 0;

    void add(double value){
        ensureCapacity();
        values[size] = value;
        size++;
    }

    void ensureCapacity(){
        if(size == values.length){
            values = Arrays.copyOf(values, values.length * 2);
        }
    }

    double get(int index){
        return values[index];
    }

    int size(){
        return size;
    }

    public static void main(String[] args) {

        DynamicArray list = new DynamicArray();
        list.add(1.5);
        list.add(3);
        list.add(399);


        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(33);
        System.out.println(list.size());
    }
}


