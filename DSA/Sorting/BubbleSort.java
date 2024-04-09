package DSA.Sorting;

public class BubbleSort {

    private static void swap(int arr [] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void show(int arr []){
        for(int n : arr){System.out.print(n+" ");}
    }

    public static void bubbleSort(int arr []){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        show(arr);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 1, 3, 7, 11, 2, 10 };
        bubbleSort(arr);
    }
}
