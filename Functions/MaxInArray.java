public class MaxInArray {

    static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 9, 2, 7, 5 };
        System.out.println("Maximum: " + findMax(arr));
    }
}
