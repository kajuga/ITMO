package Arrays;

public class SelectionSort
{
    public static void sort(int[] n)
    {
        int indexOfNextSmallest;
        for (int i = 0; i < n.length - 1; i++)
        {
            indexOfNextSmallest =
                    indexOfNextSmallest(i, n);
            interchange(i, indexOfNextSmallest, n);
        }
    }

    private static int indexOfNextSmallest(int unsorted, int[] n)
    {
        int smallest = n[unsorted];
        int indexOfNextSmallest = unsorted;
        for (int i = unsorted + 1; i < n.length; i++)
            if (n[i] < smallest)
            {
                smallest = n[i];
                indexOfNextSmallest = i;
            }
        return indexOfNextSmallest;
    }

    private static void interchange(int i, int j, int[] n)
    {
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }

    public static void main(String[] args)
    {
        int[] n = {20, 15, 19, 5, 6, 23, 40, 2, 6, 8};

        System.out.println("Before sorting:");
        for (int i = 0; i < n.length; i++)
            System.out.print(n[i] + " ");
        System.out.println();

        SelectionSort.sort(n);
        System.out.println("After sorting:");
        for (int i = 0; i < n.length; i++)
            System.out.print(n[i] + " ");
    }

}