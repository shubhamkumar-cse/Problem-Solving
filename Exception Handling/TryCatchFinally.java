public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            int a=9,b=0;
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Arthmetic error .");
        }finally{
            System.out.println("This Will Always Excute .");
        }
    }
}
