public class d214 {
    public static void main(String[] args) {
        //Maximum Sum Subarray of size K | Sliding Window
        int arr[]={2,5,1,8,3,7};
        int k=3;
        maxSumInK(arr,k);
    }
    public static void maxSumInK(int []arr,int k){
        int sum=0,maxSum=0,i,l=0;

        for ( i = 0; i < k; i++) {
            sum=sum+arr[i];
        }
        maxSum=sum;

        while (i<arr.length){
            sum=sum-arr[l++];
            sum+=arr[i++];
            maxSum=Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
}
