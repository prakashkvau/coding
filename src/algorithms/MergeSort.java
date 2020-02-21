package algorithms;


public class MergeSort {
    private void sort(int[] a, int l, int r) {

        if (l < r) {
            int mid = (l + r) / 2;
            sort(a, l, mid);
            sort(a, mid + 1, r);

            merge(a, l, r, mid);
        }
    }

    private void merge(int[] a, int l, int r, int mid) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        // copy data to left array
        for (int i = 0; i < n1; i++) {
            left[i] = a[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = a[mid + 1 + i];
        }

        // merge temp arrays
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        // copy remaining in left to a
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] a = new int[]{1, -2, 3, 2};
        m.sort(a, 0, a.length - 1);
        for (int d : a) {
            System.out.println(d);
        }
    }
}
