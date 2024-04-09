package DSA.Sorting;

public class QuickSort {

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static void show(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, ++i, j);
            }
        }
        swap(arr, i + 1, high);
        return ++i;
    }

    public static void main(String[] args) {
        int arr[] = { 222, 2, 1, 4, 3, 10, 8, 19, 6, -10 };
        quickSort(arr, 0, arr.length - 1);
        show(arr);
    }
}
