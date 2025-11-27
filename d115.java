import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class d115 {
    public static void main(String[] args) {
        int arr[]={1,2,-1,-2,1,0,-1};
        getMaxByUnique(arr);
    }

    private static void getMaxByUnique(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getKey() > 0) {
                sum += e.getKey();
            }
        }
        System.out.println(sum);
        int n=Integer.MIN_VALUE;
    }

}
