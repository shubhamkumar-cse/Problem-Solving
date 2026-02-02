
import java.util.Scanner;

public class ConvertDaysIntoYearsMonthsDays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter days : ");
        int d = sc.nextInt();
        int r = d%365;
        int year = d/365;
        if(r>=30){
            int months=r/30;
            int days=r%30;
            System.out.print("Years "+year+","+ "Months "+months +"," +"Days "+days);
        }
        else
            System.out.print("Years "+year+"," +"Days "+r);
        
    }
}
