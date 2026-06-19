import java.util.Scanner;

public class EvenOrOdd {
    public static void check(int n){
        int bit=1;
        if((n&1)==0){
            System.out.println("Even Number .");
        }else 
            System.out.println("Odd Number .");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        check(num);
    }
}
