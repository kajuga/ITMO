package Arrays;

public class FindMinMaxInArrayRandomFilled {
    public static void main(String[] args) {
        FindMinMaxInArrayRandomFilled value = new FindMinMaxInArrayRandomFilled();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Maximum value is - " + value.findMax(array));
        System.out.println("Minimum value is - " + value.findMin(array));
        System.out.println("Average value is - " + value.findAverage(array));
    }

    public int findMax(int[] array) {
        int[] temp = array;
        int max = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] > max) {
                max = temp[i];
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        int[] temp = array;
        int min = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] < min) {
                min = temp[i];            }
        }
        return min;
    }

    public double findAverage(int[] array) {
        double average;
        int[] temp = array;
        int summ = temp[0];
        for (int i = 1; i < temp.length; i++) {
            summ = temp[i] + summ;
        }
        average = (double) summ / temp.length;
        return average;
    }
}
