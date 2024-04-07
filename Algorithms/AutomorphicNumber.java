package Algorithms;

/*
 * AutomorphicNumber
 * 
 * input : 5 => 5^2 = 25 => 5 is the ones digit of 25 => automprphic
 * Input : 5
 * Output : 25
 * Explanation : Number = 5
 * when squared you get 25
 * as 25 ends with 5
*/
public class AutomorphicNumber {

    public static boolean isAutomorphic(int num){
        int pow = (int)Math.pow(num , 2); //625
        while(num!=0){
            if(num%10 != pow%10){
                return false;
            }
            num/=10;
            pow/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 7;
        System.out.println(isAutomorphic(num));
    }

}