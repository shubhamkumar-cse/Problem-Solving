import java.util.Scanner;
public class CheckVowelorConsonant {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Letter :");
        char ch=sc.next().charAt(0);
        int c=(int)ch;
        if(c>=65 && c<=90){
            System.out.println("Consonant Letter...");
        }
        else if(c>=97 && c<=122){
            System.out.println("Vowels..");
        }
        else
            System.out.println("Not Letter..");    
    }
}
