package Algorithms;


/*
 * reversed number is equal to original number => Palindrome
 */
public class PalindromeNumber {

    public static int reverse(int num){
        int res = 0;
        while(num!=0){
            int digit = num%10;
            res = (res*10)+digit;
            num/=10;
        }
        return res;
    }

    public static boolean isPalindreome(int num){    
        return num==reverse(num);
    }
    public static void main(String[] args) {
        int num = 12231;
        System.out.println(isPalindreome(num));
    }
}
