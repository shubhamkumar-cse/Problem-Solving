import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year ::");
        int x = sc.nextInt();
        if(x%400==0 || (x%4==0 && x%100!=0)){
            System.out.print(x +"\tis a Leap Year");
        }
        else
            System.out.println(x +"\tis not a Leap year");
    }
}
