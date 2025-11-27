import java.util.*;

public class d226 {
    public static void main(String[] args) {
        int arr[]={3, 4, 7, 2, -3, 1, 4, 2};
        int k=7;

        countSubArraysSumK(arr,k);
    }
    public static void countSubArraysSumK(int []arr,int k){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        int prefixSum=0;
        int count=0;

        for(int val:arr){
            prefixSum+=val;

            if(map.containsKey(prefixSum - k)){
                count+=map.get(prefixSum - k);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        System.out.println(count);
    }
}
