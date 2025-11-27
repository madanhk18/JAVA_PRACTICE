public class d167 {
    public static void main(String[] args) {
        /*Array Problem 2: Maximum Subarray (Kadane’s Problem)

Find the largest sum of a contiguous subarray in nums.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: Subarray [4,-1,2,1] has sum 6.

Example 2:
Input: nums = [1]
Output: 1*/
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        findMaxSubarraySum(arr);
    }
    public static void findMaxSubarraySum(int []arr){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int start=-1,end=-1;

        for (int i = 0; i <arr.length ; i++) {
            if(sum==0)
                start=i;

            sum+=arr[i];

            maxSum=Math.max(sum,maxSum);

            if(sum<0)
                sum=0;
        }
        System.out.println(maxSum);
    }
}
