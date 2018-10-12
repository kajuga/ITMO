package Arrays;

import java.util.Arrays;

public class MyDynamicArray<E> {
    private E[] value;
    int sizeSeeker = 0;


    private MyDynamicArray() {
        this.value = (E[])new Object[3];
    }

    public boolean add (E val) {
        boolean result;
        System.out.println("Контроллер размера = " + sizeSeeker);
        if(sizeSeeker == value.length) {
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

    public static void main(String[] args) {
        MyDynamicArray array = new MyDynamicArray();
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println("Размер массива = " + array.value.length);

        array.add(888);
        for (int i = 0; i < array.value.length; i++) {
            System.out.print(array.value[i] + " ");
        }
        System.out.println();
        System.out.println("Размер массива = "  + array.value.length);
    }



}
