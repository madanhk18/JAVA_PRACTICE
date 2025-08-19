public class demo50 {
    public static void KadensAlgo(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
    }
    public static void main(String[] args) {
        int nums[]={-3,-2,4,-1,-2,1,5,-3};
        KadensAlgo(nums);
    }
}
