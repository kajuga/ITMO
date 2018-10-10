package Arrays;

/**
 * @author Fedorov Aleksandr (msg2fedorov@gmail.com)
 * Дан массив чисел и число. Удалите все вхождения числа в массив (пропусков быть не должно).
 */
public class TearOutOverlapFromArray {
    static int xxx = 3;

    /**
     * происходит сортировка массива с пробрасыванием найденных чисел в его конец.
     * @param args
     */
    public static void main(String[] args) {
        int temp;
        int counter = 1;
        int[] array = new int[100];
        for (int i = 0; i <= array.length - counter; i++) {
            array[i] = (int)(Math.random() * 10);
            if(array[i] == xxx) {
                temp = array[i];
                array[i] = array[array.length - counter];
                array[array.length - counter] = temp;
                counter++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
/**
 * создаю массив размером первоначальный - количество вхождений и копирую в него обрезанный первоначальный массив.
  */
        int[] filteredArray = new int[array.length - counter + 1];
        System.arraycopy(array, 0, filteredArray, 0, filteredArray.length);

        for (int i = 0; i < filteredArray.length; i++) {
            System.out.print(filteredArray[i] + " ");
        }
    }
}