public class Subarray {
    public static void printSubarrays(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                    sum2 = sum;
                }
                System.out.print(" " + "=" + sum);
                if (sum2 > max) {
                    max = sum2;
                }
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("Maximum Sum ="+max);
    }

    public static void main(String[] args) {
        int[] arr = { -1, -2, 6, 1, 3 };
        printSubarrays(arr);
    }
}
