import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }

        int gcd = a;
        int lcm = (x * y) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
