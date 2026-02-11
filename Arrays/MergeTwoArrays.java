public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };

        int[] C = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            C[k++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            C[k++] = arr2[i];
        }
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
