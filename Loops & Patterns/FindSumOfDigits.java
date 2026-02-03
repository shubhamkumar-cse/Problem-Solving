import java.util.Scanner;

public class FindSumOfDigits {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Digits : "); 
        int n=sc.nextInt();
        int r;
        int x=0;
        while(n>0){
            r=n%10;
            x=x+r;
            n=n/10;
        }
        System.out.println("Sum of digits = " +x);
    }
}
