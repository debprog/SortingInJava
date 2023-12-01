public class HoaresPartititon {

    static int hpartition(int a[], int l, int h) {
        int pivot = a[l];
        int i = l - 1, j = h - 1;

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

    public static void main(String args[]) {
        int a[] = { 5, 3, 8, 4, 2, 7, 1, 10 };

        int p = hpartition(a, 0, 8);
        System.out.println(p);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

}
