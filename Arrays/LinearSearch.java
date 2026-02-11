public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 5;
        int flag = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index :" + i);
                return;
            }

        }
        System.out.println(" Not Found :");

    }
}
