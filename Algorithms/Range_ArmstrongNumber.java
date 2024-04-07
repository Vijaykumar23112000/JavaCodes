package Algorithms;

/*
 * Armstrong number between a given range
 */

public class Range_ArmstrongNumber {

    public static int length(int num){
        int res = 0;
        while(num!=0){
            res++;
            num/=10;
        }
        return res;
    }

    public static void Armstrong(int start , int end){
        for(int i = start;i<=end;i++){
            int sum =0;
            int temp = i;
            while(temp!=0){
                sum+=(int)Math.pow(temp%10, length(i));
                temp/=10;
            }
            if(sum==i){
                System.out.println(i+" ");
                i=sum;
            }
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 1000;
        Armstrong(a,b);
    }
}
