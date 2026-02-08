public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double avr=(double)sum/arr.length;
        System.out.print("Average of array : "+avr);
    }
}
