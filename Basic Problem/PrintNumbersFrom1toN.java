import java.util.Scanner;

public class PrintNumbersFrom1toN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}