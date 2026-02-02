import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.print("Enter Celsius °C :" );
        Scanner sc =new Scanner(System.in);
        float c=sc.nextFloat();
        float f=(c*9/5+32);
        System.out.print("Fahrenheit °F :"+f );
    }
}