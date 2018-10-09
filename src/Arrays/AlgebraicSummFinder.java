package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fedorov Aleksandr (msg2fedorov@gmail.com)
 * Найти алгебраическую сумму для выражения: 1​ k​ + 2​ k​ + 3​ k​ + ... + N​ k​ . N и степень k
вводит пользователь.
 */

public class AlgebraicSummFinder {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFirst = reader.readLine();
        String inputSecond = reader.readLine();
        int valueN =Integer.parseInt(inputFirst);
        int valueK =Integer.parseInt(inputSecond);
        int[] array = new int[valueN];
        AlgebraicSummFinder algebraicSummFinder = new AlgebraicSummFinder();
        System.out.println(algebraicSummFinder.summCounter(array, valueK));
    }

    /**
     * Наполнение массива длиной N числами, возведеными в степень k
     * @param array
     * @param row
     * @return
     */
    public int summCounter(int[] array, int row) {
        int summ = 0;
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = getRowValue(value, row);
            summ += array[i];
            value++;
        }
        return summ;
    }

    /**
     * Получаем величину числа (value), возведенного в степень (row)
     * @param value - число
     * @param row - степень
     * @return искомое
     */
    public int getRowValue (int value, int row) {
            int result = 1;
            for (int i = 1; i <= row; i++){
                result = result * value;
            }
            return result;
        }
    }