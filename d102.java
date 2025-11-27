import java.util.Arrays;
import java.util.HashMap;

public class d102 {
    public static void main(String[] args) {
        int arr[]={1,7,3,2};
        int target=9;
        System.out.println(Arrays.toString(TwoSum(arr,target)));
    }
    public static int[] TwoSum(int []arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int remainer=target-arr[i];
            if(map.containsKey(remainer)){
                return new int[]{i,map.get(remainer)};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1};
    }
}
