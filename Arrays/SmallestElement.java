public class SmallestElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,-3,-1};
        int s=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<s){
                s=arr[i];
            }
        }
        System.out.println("Smallest element in array : "+s);
    }
}
