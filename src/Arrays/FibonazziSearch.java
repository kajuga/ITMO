package Arrays;

/**
 * @author Fedorov Aleksandr (msg2fedorov@gmail.com)
 * Вычислить N-е ​ число Фибоначчи​
 */
public class FibonazziSearch {
    public static void main(String[] args) {
        int N = 20;
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            if (i < 2) {
                array[i] = 1;
            } else {
                array[i] = array[i - 2] + array[i - 1];
            }
        }
        System.out.println(array[19]);
    }
}