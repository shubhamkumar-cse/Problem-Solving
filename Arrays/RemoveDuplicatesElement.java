public class RemoveDuplicatesElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,6,6,7,9,6};
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                 System.out.print(arr[i] + " ");
            }
        }
    }
}
