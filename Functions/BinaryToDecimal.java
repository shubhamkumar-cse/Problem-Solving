public class BinaryToDecimal {
    public static int ConvertDecimal(int n){
        int d=0;
        int pow=0;
        while(n>0){
            int r=n%10;
            d+=r*(int)Math.pow(2, pow);
            n/=10;
            pow++;
        }
        return d;
    }
    public static void main(String[] args) {
        int result=ConvertDecimal(100);
        System.out.println("Decimal= "+result);
    }
}
