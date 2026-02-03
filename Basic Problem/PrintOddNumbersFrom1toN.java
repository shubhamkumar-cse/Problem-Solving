import java.util.Scanner;

public class PrintOddNumbersFrom1toN {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        System.out.println(".....ODD NUMBER....");
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }    
        }
    }
}
