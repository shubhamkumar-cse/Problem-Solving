public class MaxSumSubarray {
    public static void MaxSum (int arr[]){
        int CurrentSum=0;
        int Maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            CurrentSum+=arr[i];
            if(CurrentSum>Maxsum){
                Maxsum=CurrentSum;
            }

            if(CurrentSum<1){
                CurrentSum=0;
            }
            
        }
        System.out.println("Maximum Subaaray Sum="+Maxsum);

    }
    public static void main(String[] args) {
        int [] arr={-2,-3,4,-1,-2,1,5,-3};
        MaxSum(arr);
    }
}
