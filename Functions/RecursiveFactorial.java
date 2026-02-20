import java.util.Scanner;

public class RecursiveFactorial {

    static int checkFactorial(int num) {

        // Base Case
        if (num == 0 || num == 1) {
            return 1;
        }

        // Recursive Case
        return num * checkFactorial(num - 1);
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
