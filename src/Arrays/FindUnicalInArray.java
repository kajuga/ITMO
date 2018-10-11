package Arrays;

import java.util.Arrays;

/**
 * @author Fedorov Aleksandr (msg2fedrov@gmail.com)
 * Дан массив чисел. Найдите первое уникальное в это массиве число.
 * Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
 */
public class FindUnicalInArray {

    private static void findUnicalInArray(int[] arr){

        boolean existUnique = false;

        for (int i = 0; i < arr.length; i++){
            boolean found = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break; //выходим из вложенного цикла
                }
            }

            if (found == false) {
                System.out.println(arr[i]);
                existUnique = true;
                break; // выходим из внутреннего цикла
            }
        }

        if (existUnique == false){
            System.out.println("Not unique value");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(arr));
        findUnicalInArray(arr);

        int[] arr1 = new int[]{1, 2, 3, 1, 2, 4};
        System.out.println(Arrays.toString(arr1));
        findUnicalInArray(arr1);
    }
}

