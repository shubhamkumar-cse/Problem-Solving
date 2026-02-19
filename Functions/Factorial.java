import java.util.Scanner;

public class Factorial {

    static int checkFactorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            int result = checkFactorial(num);
            System.out.println("Factorial = " + result);
        }
    }
}
