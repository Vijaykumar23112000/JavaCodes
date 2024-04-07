package Algorithms;

/*
 *  input = 145
 *  output = 1! + 4! + 5! ==> 145 => true
 */
public class StrongNumber {

    public static boolean isStrongNumber(int n){
        int temp = n;
        int res = 0;    
        while(temp!=0){
            int digit = temp%10;
            res += fact(digit);
            temp/=10;
        }
        return res==n;
    }

    public static int fact(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){f*=i;}
        return f;
    }
    public static void main(String[] args) {
        int num = 145;
        System.out.println(isStrongNumber(num));
    }
}
