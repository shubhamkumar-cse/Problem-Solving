import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : "); 
        int n=sc.nextInt();
        int r;
        int x=0;
        while(n>0){
            r=n%10;
            x=x*10+r;
            n=n/10;
        }
        System.out.println("Reverse a number = " +x);
    }
}