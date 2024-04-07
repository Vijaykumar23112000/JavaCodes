package Algorithms;

/*
 *  perfect number if the number itself is equal to the sum of its divisors
 */
public class PerfectNumber {

    public static boolean isPerfectNumber(int n){
        int sum = 0;
        for(int i = 1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
    public static void main(String[] args) {
        int num = 6;
        System.out.println(isPerfectNumber(num));
    }
}
