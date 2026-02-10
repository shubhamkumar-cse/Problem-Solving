public class SortArray {
    public static void main(String[] args) {
        int[] arr={1,9,-3,4,2,6,7,0,0};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("Sorted Array in Ascending Order :");
        for(int x : arr){
            System.out.print(x +" ");
        }
    }
}
