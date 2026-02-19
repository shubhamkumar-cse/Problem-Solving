import java.util.Scanner;

public class Prime {
    static void checkPrime(int num) {

        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }

        System.out.println("Prime Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        checkPrime(num);
    }

}
