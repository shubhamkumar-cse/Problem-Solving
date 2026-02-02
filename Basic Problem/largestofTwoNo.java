import java.util.Scanner;

public class largestofTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number");
        int x= sc.nextInt();
        int y=sc.nextInt();
        if(x>y){
            System.out.println("Largest Number " +x);
        }
        else
            System.out.println("Largest number "+y);
    }
}
