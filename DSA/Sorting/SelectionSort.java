package DSA.Sorting;

public class SelectionSort {

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

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
        show(arr);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -12, 3, 2, 19, 4, 10, -20 };
        selectionSort(arr);
    }
}
