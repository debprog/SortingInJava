public class qsortLomurto {

    static int l_partition(int a[], int l, int h) {
        int pivot = a[h];
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[h];
        a[h] = temp;

        return i + 1;

    }

    static void qsort(int a[], int l, int h) {
        if (l < h) {
            int p = l_partition(a, l, h);
            qsort(a, l, p - 1);
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
