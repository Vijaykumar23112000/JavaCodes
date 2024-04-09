package DSA.Sorting;

public class MergeSort {

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int main_arr[], int left, int mid, int right) {
        int left_arr[] = new int[mid - left + 1];
        int right_arr[] = new int[right - mid];

        for (int x = 0; x < left_arr.length; x++) {
            left_arr[x] = main_arr[left + x];
        }

        for (int x = 0; x < right_arr.length; x++) {
            right_arr[x] = main_arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < left_arr.length && j < right_arr.length) {
            main_arr[k] = left_arr[i] < right_arr[j] ? (main_arr[k++] = left_arr[i++])
                    : (main_arr[k++] = right_arr[j++]);
        }

        while (i < left_arr.length) {
            main_arr[k++] = left_arr[i++];
        }
        while (j < right_arr.length) {
            main_arr[k++] = right_arr[j++];
        }
    }

    private static void show(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { -12, 222, 2, 1, 4, 3, 10, 8, 19, 6 };
        mergeSort(arr, 0, arr.length - 1);
        show(arr);
    }
}
