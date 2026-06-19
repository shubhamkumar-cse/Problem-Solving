class SumofPosandNeg{
    static int[] returnPosansNeg(int arr[]){
        int possum=0;
        int negsum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                possum+=arr[i];
            }else{
                negsum+=arr[i];
            }
        }
        int ans[]={possum,negsum};
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,0,-3,-3,5,7};
        int ans[]=returnPosansNeg(arr);
        System.out.println("Positive Sum :" +ans[0]);
        System.out.println("negative Sum :"+ans [1]);
    }
}