package algorithms;

public class QuickSort {

    private void sort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            sort(a, low, pi - 1);
            sort(a, pi + 1, high);
        }

    }

    private int partition(int[] a, int low, int high) {
        int part = a[high];
        int j = (low - 1);
        for (int i = low; i < high; i++) {
            if (a[i] <= part) {
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[j + 1];
        a[j + 1] = a[high];
        a[high] = temp;
        return j + 1;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] a = new int[]{1, -2, 3, 2};
        quickSort.sort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
