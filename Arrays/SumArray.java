public class SumArray {
    public static void main(String[] args){
        int[] arr={5,6,7,8,9,0,2};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.print("Sum of array elements : "+sum);
    }
}
