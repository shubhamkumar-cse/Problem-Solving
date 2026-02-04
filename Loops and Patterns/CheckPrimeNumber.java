import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < num; i++) {         //or for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (num <= 1) {
            System.out.println(num + " Is Not Prime Number...");
        } else if (flag == 0) {
            System.out.println(num + " Is Prime Number...");
        } else
            System.out.println(num + " Is Not Prime Number...");
    }
}