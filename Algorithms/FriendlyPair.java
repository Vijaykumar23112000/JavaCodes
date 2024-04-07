package Algorithms;

/*
 * Input : 6 28
 * Output : Yes, they are a friendly pair
 * Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14 respectively.
 * Now the sum of factors of both the numbers are 6 and 28 respectively. 
 * When we divide the sums with the numbers we get 1 and 1 respectively. 
 * As the ratio of both the number match, they are considered as a friendly pair.
 */
public class FriendlyPair {

    public static int factors(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0) sum+=i; 
        }
        return sum;
    }

    public static boolean isFriendlyPair(int a , int b){
        int f1 = factors(a);
        int f2 = factors(b);
        return a%f1==0 && b%f2==0;
    }
    public static void main(String[] args) {
        int a = 6;int b = 28;
        System.out.println(isFriendlyPair(a,b));
    }
}
