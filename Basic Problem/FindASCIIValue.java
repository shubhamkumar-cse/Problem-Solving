import java.util.Scanner;

public class FindASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character :");
        char ch=sc.next().charAt(0);
        int x=(int)ch;
        System.out.println("ASII="+x);
    }
}
