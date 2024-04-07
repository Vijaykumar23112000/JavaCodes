package Algorithms;


/*
 * to check if a number is prime or not
 */
public class isPrime {

    public static boolean isPrimeNum(int num){
        for(int i = 2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        int num = 17;
        System.out.println(isPrimeNum(num));
    }
}
