class mergeSortedArray {
    static void merge(int a[], int b[]) {

        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            }

            else {
                System.out.print(b[j] + " ");
                j++;

            }
        }

        while (i < a.length) {
            System.out.print(a[i] + " ");
            i++;
        }

        while (j < b.length) {
            System.out.print(b[j] + " ");
            j++;

        }

    }

    public static void main(String[] args) {
        int a[] = { 1, 9, 88, 200 };
        int b[] = { 5, 88, 200, 601, 777, 10000 };

        merge(a, b);
    }
}