import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age : ");
        int age=sc.nextInt();
        if(age<18){
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("You can vote");
    }
}
