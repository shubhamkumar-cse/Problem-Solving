import java.util.Scanner;

public class CheckPalindromeNumber {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : "); 
        int n=sc.nextInt();
        int a=n;
        int r;
        int x=0;
        while(n>0){
            r=n%10;
            x=x*10+r;
            n=n/10;
        }
        if(x==a){
            System.out.println("Palindrome number= " +x);
        }
        else
            System.out.println("Not palindrome number");    
    }
}
