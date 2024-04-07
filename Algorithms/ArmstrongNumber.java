package Algorithms;

/*
 *  abcd = a^n + b^n +c^n +d^n
 * if it satisfies the above condition , then the number is Armstrong number
 */
public class ArmstrongNumber {

    public static int length(int num){
        int len = 0;
        while(num!=0){
            len++;
            num/=10;
        }
        return len;
    }

    public static boolean isArmstrong(int num){
        int len = length(num);
        int temp = num;
        int res = 0;
        while(temp!=0){
            int digit = temp%10;
            res += (int)Math.pow(digit, len);
            temp /=10;
        }
        return res==num;
    }
    public static void main(String[] args) {
        // int num = 371;
        int num = 407;
        System.out.println(isArmstrong(num));
    }
}
