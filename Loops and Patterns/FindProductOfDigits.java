import java.util.Scanner;

public class FindProductOfDigits {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Digits : "); 
        int n=sc.nextInt();
        int r;
        int x=1;
        while(n>0){
            r=n%10;
            x=x*r;
            n=n/10;
        }
        System.out.println("Product of digits = " +x);
    }    
}
