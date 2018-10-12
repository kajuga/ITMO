package Arrays;

import java.util.Arrays;

/**
 * @author Fedorov Aleksandr (msg2fedorov@gmail.com)
 * Дан массив и число K. Найдите первые K самых часто встречающихся элементов.
 */
public class FirstNumbersFinder {

    public static void main(String[] args) {
        int K = 3;
        int counter;
        int[] array = new int[10];
        int[] filtered = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("=======");

        for (int i = 0; i < array.length; i++) {
            int innerCounter = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    innerCounter++;
                    System.out.println(innerCounter);
                }
            }
            if (innerCounter != 0) {
                int filteredCounter = 0;
                filtered[filteredCounter] = array[i];
                filteredCounter++;
                System.out.println(filtered[filteredCounter]);
            }
        }
        System.out.println("Отфильтрованный массив:");
        System.out.println();
        Arrays.sort(filtered);
        for (int i = filtered.length; i < filtered.length - K; i--) {
            System.out.println(Arrays.toString(filtered) + " ");
        }
    }
}

