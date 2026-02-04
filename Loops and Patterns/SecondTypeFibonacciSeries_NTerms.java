import java.util.Scanner;

public class SecondTypeFibonacciSeries_NTerms {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N Terms : ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(num1);
        } else if (n == 2) {
            System.out.print(num1 + " " + num2);
        } else
            System.out.print(num1 + " " + num2);
        for (int i = 2; i < n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3);
        }

    }
}
