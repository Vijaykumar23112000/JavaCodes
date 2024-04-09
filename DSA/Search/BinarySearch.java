package DSA.Search;

public class BinarySearch {

    public static boolean binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Element at : " + mid);
                return true;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.out.println("Element invalid");
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { -10, -1, 2, 6, 10, 13, 19 };
        int target = 6;
        System.out.println(binarySearch(arr, target));
    }
}
