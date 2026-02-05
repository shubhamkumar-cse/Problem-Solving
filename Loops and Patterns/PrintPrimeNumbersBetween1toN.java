import java.util.Scanner;

public class PrintPrimeNumbersBetween1toN {
    static void CheckPrime(int n) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int x=0;
        if (n == 1) {
            System.out.println("1 is not prime number ...");
        }
        for (i = 2; i <= n; i++) {
            int flag = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(" " + i);
                x++;
            }
        }
        System.out.println("\nNumber Of Prime Number = "+x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth Number :");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("1 is not prime number ...");
        }
        CheckPrime(n);

    }
}