package Algorithms;

public interface NumberConversion {

    public static int binaryToDecimal(int binary){//1011
        int decimal = 0;
        int n=0;
        while(binary!=0){
            int digit = binary%10;
            decimal+=digit*Math.pow(2, n++);
            binary/=10;
        }
        return decimal;
    }

    public static int octalToDecimal(int octal){
        int decimal = 0;
        int n = 0;
        while(octal!=0){
            int digit = octal%10;
            decimal+=digit*Math.pow(8, n++);
            octal/=10;
        }
        return decimal;
    }

    public static int decimalToBinary(int decimal){
        StringBuilder sb = new StringBuilder();
        while(decimal!=0){
            sb.insert(0, decimal%2);
            decimal/=2;
        }
        return Integer.parseInt(sb.toString());        
    }

    public static int decimalToOctal(int decimal){
        StringBuilder sb = new StringBuilder();
        while(decimal!=0){
            sb.insert(0,decimal%8);
            decimal/=8;
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        // int binary = 1001;
        // System.out.println(binaryToDecimal(binary));
        // int octal = 512;
        // System.out.println(octalToDecimal(octal));
        // int decimal = 8;
        // System.out.println(decimalToBinary(decimal));
        int decimal = 394;
        System.out.println(decimalToOctal(decimal));
    }
}
