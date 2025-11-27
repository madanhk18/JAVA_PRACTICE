public class d162 {
    public static void main(String[] args) {
        int arr[]={2,3,6,5,1,8,3,9,7};
        int subArr=3;
        maxSubarray(arr,subArr);
    }
    public static void maxSubarray(int []arr,int sub){
        int maxSum=0;
        for (int i = 0; i <arr.length -sub; i++) {
            int sum=0;
            for (int j = i; j <i+sub ; j++) {
                sum+=arr[j];
            }
            maxSum=Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
    }
}
