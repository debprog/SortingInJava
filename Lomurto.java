import java.io.*;

class Lomurto {

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static int lpartition(int arr[], int l, int h) {
        int pivot = arr[h];
        int i = l - 1;

        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr[i], arr[j]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        swap(arr[i + 1], arr[h]);
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return (i + 1);
    }

    public static void main(String args[]) {
        int a[] = { 10, 80, 30, 90, 40, 50, 70 };
        lpartition(a, 0, 6);
        for (int x : a) {
            System.out.print(x + "  ");
        }

    }
}
