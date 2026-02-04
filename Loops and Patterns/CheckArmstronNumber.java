import java.util.Scanner;
import java.lang.Math;

public class CheckArmstronNumber {
    public  int countdigit(int n){
    int x=0;
    while(n>0){
        int r=n%10;
         x++;
        n=n/10;
    }
    return x;  
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : "); 
        int n=sc.nextInt();
        int a=n;
        int r;
        int x=0;
        CheckArmstronNumber cd=new CheckArmstronNumber();
        int d=cd.countdigit(n);
        while(n>0){
            r=n%10;
            int p=(int)Math.pow(r, d);
            x=x+p;
            n=n/10;
        }
        if(a==x){
            System.out.println("Armstrong Number ...");
        }
        else
            System.out.println("Not Armstrong Number ..");
        
    }
}