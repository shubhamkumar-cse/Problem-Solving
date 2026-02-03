import java.util.Scanner;

public class  FindSumOfFirst_N_NaturalNumbers{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        int i;
        int x=0;
        for(i=1;i<=n;i++){
            x+=i;
        }
        System.out.println("Find sum of first N natural numbers = "+x);
    }
}
