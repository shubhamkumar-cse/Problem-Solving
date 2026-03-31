public class DecimalToBinary {
    public static int ConvertBinary(int n){
        int pow=0;
        int Bin=0;
        while(n>0){
            int rem=n%2;
            Bin+=rem*(int)Math.pow(10, pow);
            pow++;
            n/=2;
        }
        return Bin;
    }
    public static void main(String[] args) {
        int result=ConvertBinary(11);
        System.out.println("Binary = "+result);
    }
}
