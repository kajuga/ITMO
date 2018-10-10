package Arrays;

/**
 * @author Fedorov Aleksandr (msg2fedorov@gmai.com)
 * Напишите программу, которая вычислит ​ простые числа​ в пределах от 2 до 100.
 *
 */
public class SimpleValues {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) continue;
            if (i % 3 == 0) continue;
            if (i % 5 == 0) continue;
            if (i % 7 == 0) continue;
            System.out.print(i + " ");
        }
    }
}