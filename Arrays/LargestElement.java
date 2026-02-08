public class LargestElement {
    public static void main(String[] args) {
        int[] arr={-3,-5,-6,-9,8};
        int l = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
        System.out.print("Largest element in array : "+l);
    }
}
