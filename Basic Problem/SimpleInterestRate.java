import java.util.Scanner;

public class SimpleInterestRate {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Principal= ");
        float p =sc.nextFloat();
        System.out.print("Enter Rate= ");
        int r =sc.nextInt();
        System.out.print("Enter Time= ");
        int t = sc.nextInt();
        float si= (p*r*t)/100;
        System.out.println("Simple Interest= "+si);
        
    }
}
