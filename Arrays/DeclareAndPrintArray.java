
import java.util.Scanner;

public class DeclareAndPrintArray {
    public static void main(String[] args) {
        int[] arr;
        arr =new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 elements:");
        for(int i=0;i<arr.length;i++){                //Input
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){               //Print
            System.out.print(arr[j]+" ");
        }
    }
}
