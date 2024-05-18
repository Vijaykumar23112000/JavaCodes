package Leetcode;

/*
        Example 1:
        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.
        
        Example 2:
        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        
        Example 3:
        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome. 
*/

public class PalindromeNumber {
    
    public static int reverse(int num){
        int rev = 0;
        while(num!=0){
            int digit = num%10;
            rev = (rev*10) +digit;
            num/=10;
        }
        return rev;
    }

    public static boolean isPalindrome(int x){
        int y = reverse(x);
        return y<0 ? false : x==y;
    }
}