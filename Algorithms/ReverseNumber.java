package Algorithms;

public class ReverseNumber {

    public static int reverse(int num){
        int temp = num;
        int rev = 0;
        while(temp!=0){
            int digit = temp%10;
            rev= (rev * 10 )  + digit;
            temp = temp/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 1223;
        System.out.println(reverse(num));
    }
}
