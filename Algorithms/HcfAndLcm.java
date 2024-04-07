package Algorithms;

public class HcfAndLcm {

    public static int lcm(int a , int b){
        return (a*b)/hcf(a,b);
    }

    public static int hcf(int a , int b){
        int res = 1;
        for(int i = 1;i<=a || i<=b;i++){
            if(a%i==0 && b%i==0) res = i;
        }
        return res;
    }
    public static void main(String[] args) {
        int a = 36; int b = 60;
        int hcf = hcf(a,b);
        System.out.println(hcf);
        System.out.println(lcm(12,14));
    }
}
