
import java.util.Scanner;
public class addnumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First No :");
        int a = sc.nextInt();
        System.out.print("Enter Second No:");
        int b =sc.nextInt();
        int d= a+b;
        System.out.println(d);
    }
}