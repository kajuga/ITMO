package Arrays;

/**
 * @author Aleksandr Fedorov
 * Заполните массив случайным числами и отсортируйте его.
Используйте ​ сортировку пузырьком​ , сортировку выбором​ или ​ сортировку
вставками​.
 */
public class TreeSortedArrays {

    public static void main(String[] args) {
        TreeSortedArrays treeSortedArrays = new TreeSortedArrays();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        treeSortedArrays.bubbleSorting(array);
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }

    /**
     * Bubblesorting по возрастанию
     * @param array
     */

    public void bubbleSorting(int[] array) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}