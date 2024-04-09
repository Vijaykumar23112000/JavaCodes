package DSA.Sorting;

public class InsertionSort {

    private static void show(int arr []){
        for(int n : arr){System.out.print(n+" ");}
    }

    public static void insertionSort(int arr []) {
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j--];
            }
            arr[j+1]=key;
        }
        show(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 12, 3, 9, 3, 5, 10, 20, 15 , -1 , -11 };
        insertionSort(arr);
    }
}
