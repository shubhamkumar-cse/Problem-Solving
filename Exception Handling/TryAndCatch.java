public class TryAndCatch {
     public static void main(String[] args) {
        try{
            int a=2;
            int b=0;
            int d=a/b;  
        }catch(ArithmeticException e){
            System.out.println("Arthmetic error");
        }
        try{
            int []arr=new int[5];
            arr[6]=8;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array IndexOut Of Bounds Error");
        }

     } 
}
