package algorithms;

public class BinarySearch {
    int[] data = new int[]{1, 3, 5, 6, 7, 8};

    private boolean search(int i) {
        int s = data.length;
        int low = 0;

        while (low <= s) {
            int mid = (low + s) / 2;
            if (data[mid] == i) {
                return true;
            } else if (data[mid] < i) {
                low = mid + 1;
            } else {
                s = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(1));
    }
    // comment add 1
}
