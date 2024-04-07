package Algorithms;


/*
 *  f(0) = 0
 *  f(1) = 1
 *  nth therm : => f(n) = f(n-2) + f(n-2)+...
 */
public class FibonacciSeries {

    public static int nthTermOfFibonacci(int num){
        if(num==0)return 0;
        else if(num==1) return 1;
        else{
            int a = 0;int b=1;int next=0;
            for(int i=2;i<num;i++){
                next = a+b;
                a=b;b=next;
            }
            return next;
        }
    }

    public static void fibonacci(int num){
        if(num==0)System.out.println(0);
        else if(num==1)System.out.println(1);
        else{
            int next;
            int a = 0;int b = 1;
            System.out.println(0);
            System.out.println(1);
            for(int i = 2;i<num;i++){
                next = a+b;
                a = b;
                b = next;
                System.out.println(next);
            }
        }
    }
    public static void main(String[] args) {

        // int num = 5;
        // fibonacci(num);
        int n = nthTermOfFibonacci(5);
        System.out.println(n);
    }
}
