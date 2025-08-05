import java.util.HashMap;
import java.util.Map;

public class demo34 {
    public static void hashFunc(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
      for (Map.Entry<Integer,Integer> e:map.entrySet()){
          if(e.getValue()==1){
              System.out.println(e.getKey());
          }
      }
        }

    public static void main(String[] args) {
        int []nums = {1,1,2,3,3,4,4,8,8};
        hashFunc(nums);
    }
}
