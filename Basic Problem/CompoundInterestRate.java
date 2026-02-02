import java.util.Scanner;

public class CompoundInterestRate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle : ");
        double p = sc.nextDouble(); // Because Math.Pow return Double value

        System.out.print("Enter Rate % Per year : ");
        double r = sc.nextDouble();

        System.out.print("Time in Years : ");
        double t = sc.nextDouble();

        System.out.print("Number of times interest is compounded per year : ");
        double n = sc.nextDouble();

        double b = 1 + r / (n * 100);   
        double po = n * t;

        double a = p * Math.pow(b, po); 

        System.out.print("Total Amount : " + a);
    }
}

