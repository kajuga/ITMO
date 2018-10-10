package Arrays;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Fedorov Aleksandr (msg2fedrov@gmail.com)
 * Дан массив чисел. Найдите первое уникальное в это массиве число.
 * Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
 */
public class FindUnicalInArray {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10);
//        arr[i] = (new Random().nextInt(20));

        pw.print(Arrays.toString(arr) + "\n");
        for (int i = 0; i < arr.length; i++){
            boolean found = false;
            for (int j = 0; j < arr.length; j++)
                if (i != j && arr[i] == arr[j]) found = true;

            if (found == false) pw.printf(arr[i] + " ");
            break;
        }
    }
}

