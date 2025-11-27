public class d168 {
    public static void main(String[] args) {

        /*
        Problem: Move Zeroes

Given an integer array nums, move all 0s to the end while maintaining the relative order of the non-zero elements. Do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
         */
        int nums[]={0,1,0,3,12};
        MoveZeroes(nums);
        for (int v:nums){
            System.out.print(v+" ");
        }
    }
    public static void MoveZeroes(int []nums){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                nums[index++]=nums[i];
        }
        while (index<nums.length){
            nums[index++]=0;
        }
    }
}
