package Arrays;

/**
 * @author Fedorov Aleksandr (msg2fedrov@gmail.com)
 * Дан массив чисел. Найдите первое уникальное в это массиве число.
 * Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
 */
public class FindUnicalInArray {

    public static void main(String[] args) {
        FindUnicalInArray findUnicalInArray = new FindUnicalInArray();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        int res = findUnicalInArray.unicalFinder(array);
        System.out.println();
        System.out.println(array[res]);

    }
    public int unicalFinder(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    continue;
                } else {
                    result = array[i];
                    break;
                }
            }
        }
        return result;
    }

}



