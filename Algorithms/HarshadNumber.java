package Algorithms;

/*
 * Suppose a number 24 .
 * Calculate the sum of digits of the number (2 + 4) = 6 .
 * Check whether the number entered by user is completely divisible by sum of its digits or not.
 */
public class HarshadNumber {
    public static boolean isHarshadNumber(int num){
        int sum = 0;
        int temp = num;
        while(temp!=0){
            int dig = temp%10;
            sum+=dig;
            temp/=10;
        }
        return num%sum==0;
    }
    public static void main(String[] args) {
        int num = 24;
        System.out.println(isHarshadNumber(num));
    }
}
