import java.util.Scanner;

public class PrintMultiplicationTableOf_a_Number {
    static void Mtable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        Mtable(n);
    }
}
