import java.util.HashMap;
import java.util.Map;

public class demo12 {
    public static int nonRepeating(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1)
                return e.getKey();
        }
    return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,1,3};
        System.out.println(nonRepeating(arr));
    }
}
