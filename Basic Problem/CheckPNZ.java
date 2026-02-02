import java.util.Scanner;

public class CheckPNZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        float x = sc.nextFloat();

        if (x > 0) {
            System.out.println("Positive Number");
        } 
        else if (x < 0) {
            System.out.println("Negative Number");
        } 
        else {
            System.out.println("Zero");
        }
    }
}

