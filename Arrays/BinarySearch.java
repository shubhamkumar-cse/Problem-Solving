import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -2, -1, 2, 3, 4, 5, 6, 7, 8 };
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Key :" );
        int key=sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Found at index :" + mid);
                return;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        System.out.println("Not Found....");
    }
}
