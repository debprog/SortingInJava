public class MergeSort {

    static void merge(int a[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];
        // store in auxillary array
        for (int i = 0; i < n1; i++) {
            left[i] = a[low + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = a[mid + j + 1];
        }
        // standard merge

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        while (i < n1) {
            a[k++] = left[i++];
        }

        while (j < n2) {
            a[k++] = right[j++];
        }

    }

    static void mergeSorting(int a[], int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            mergeSorting(a, l, m);
            mergeSorting(a, m + 1, r);
            merge(a, l, m, r);

        }

    }

    public static void main(String args[]) {

        int a[] = { 10, 5, 30, 15, 7 };
        int l = 0;
        int r = 4;

        mergeSorting(a, l, r);

        for (int x : a) {
            System.out.print(x + " ");
        }

    }
}
