public class qsortHoare {

    static int hpartition(int a[], int l, int h) {
        int pivot = a[l];
        int i = l - 1, j = h + 1;

        while (true) {
            do {
                i++;

            } while (a[i] < pivot);

            do {
                j--;

            } while (a[j] > pivot);

            if (i >= j)
                return j;

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    static void qsort(int a[], int l, int h) {
        if (l < h) {
            int p = hpartition(a, l, h);
            qsort(a, l, p);
            qsort(a, p + 1, h);
        }
    }

    public static void main(String args[]) {
        int a[] = { 8, 4, 7, 9, 3, 10, 5 };

        int n = a.length;
        qsort(a, 0, n - 1);

        for (int x : a) {
            System.out.print(x + "   ");
        }
    }
}
