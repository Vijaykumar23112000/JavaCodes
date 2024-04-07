package Algorithms;

class MaxElementInArray{

    public static void swap(int arr [] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int maxElement(int arr []){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr [] = {10,1000,29,3,5,11,4,200};
        System.out.println(maxElement(arr));
    }
}