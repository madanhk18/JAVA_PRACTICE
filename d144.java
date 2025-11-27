public class d144 {
    public static void main(String[] args) {
        int arr[]={2,5,1,12,2,4,3};
        int windowSize=3;
        generateMaxSubarray(arr,windowSize);
    }
    public static void generateMaxSubarray(int []arr,int k){
        int maxSum=0;
        int WindowSum=0;

        for (int i = 0; i < k; i++) {
            WindowSum+=arr[i];
        }
        maxSum=WindowSum;
        for (int i = k; i <arr.length ; i++) {
            WindowSum+=arr[i];
            WindowSum=WindowSum-arr[i-k];
            maxSum=Math.max(maxSum,WindowSum);
        }
        System.out.println(maxSum);
    }
}
