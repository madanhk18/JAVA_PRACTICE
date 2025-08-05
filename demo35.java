public class demo35 {
    public static void firstandLast(int[] nums,int target){
        int first=-1;
        int low=0;int high=nums.length-1;
        while (low<=high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                first=mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else
                high = mid - 1;

        }
        System.out.println(first+" ");
        //last
        int last=-1;
        int lower=0;int higher=nums.length-1;
        while (lower<=higher) {
            int mid = (lower + higher) / 2;
            if (nums[mid] == target) {
                last=mid;
               lower=mid+1;
            } else if (nums[mid] < target) {
                lower= mid+1;
            } else
                higher = mid - 1;
        }
        System.out.println(last);
    }
    public static void main(String[] args) {
        int []nums={5,7,6,6,8,8,9,9,9,9,9,10,10,10};
        int target = 9;
        firstandLast(nums,target);
    }
}
