import java.util.HashMap;

public class d169 {
    public static void main(String[] args) {
        /*
        Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9.

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
         */
        int arr[]={2,7,11,15};
        int target=9;
       int[] res= twpSum(arr,target);
       for (int v:res){
           System.out.print(v+" ");
       }
    }
    public static int[] twpSum(int []arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            int remainder=target-arr[i];
            if(map.containsKey(remainder))
                return new int[]{i,map.get(remainder)};
            else
                map.put(arr[i],i);
        }
        return new int[]{-1};
    }
}
