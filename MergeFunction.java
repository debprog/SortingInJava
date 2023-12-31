class MergeFunction {

    static void merge(int a[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];
        // store in 2 auxillary array
        for (int i = 0; i < n1; i++) {
            left[i] = a[low + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = a[n1 + j];
        }

        // standard merge

        int i = 0, j = 0, k = 0;

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

    public static void main(String args[]) {
        int a[] = { 10, 15, 20, 40, 8, 11, 15, 22, 25 };
        merge(a, 0, 3, 8);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
