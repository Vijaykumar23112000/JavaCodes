package DSA.Search;

public class LinearSearch {

    public static boolean linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element at : " + i);
                return true;
            }
        }
        System.out.println("Element invalid");
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -1, 3, 10, 13, 5, 6 };
        int target = 6;
        System.out.println(linearSearch(arr, target));
    }
}
