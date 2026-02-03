import java.util.Scanner;

public class FindFactorialOf_a_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        int x=1;
        for(int i=1;i<=n;i++){
            x=x*i;
        }
        System.out.println("Find factorial of a number = "+x);
    }
}
