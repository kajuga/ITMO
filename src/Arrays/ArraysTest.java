package Arrays;

import java.util.Arrays;

public class ArraysTest<E> {
    private E[] value;
    int sizeSeeker = 0;

    private ArraysTest() {
        this.value = (E[])new Object[16];
    }

    public boolean add (E val) {
        boolean result;
        System.out.println("Контроллер размера = " + sizeSeeker);
        if(sizeSeeker >= value.length) {
            E[] temp = value;
            value = (E[])new Object[value.length * 2];
            System.out.println("Длина нового массива" + value.length);
            System.arraycopy(temp, 0, value, 0, temp.length);
        }
        this.value[sizeSeeker] = val;
        sizeSeeker++;
        result = true;
        return result;
    }

    public int size(){
        return sizeSeeker;
    }

    public static void main(String[] args) {
        ArraysTest array = new ArraysTest();
        System.out.println("Контроллер размера = " + array.size());
        for (int i = 0; i < array.value.length; i++) {
            array.add(Math.random() * 10);
            System.out.print(array.value[i] + " ");
        }
        System.out.println();

        System.out.println("Размер массива = "  + array.value.length);

        array.add(888);
        for (int i = 0; i < array.value.length; i++) {
            System.out.print(array.value[i] + " ");
        }
        System.out.println();
        System.out.println("Размер массива = "  + array.value.length);
    }



}


