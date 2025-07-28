import java.util.HashMap;

public class demo19 {
    public static void MajorityEle(int []arr){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
//        System.out.println(map);
        for (int val:arr) {
            if (map.get(val) > (n / 2)) {
                System.out.println(val);
                break;
            }
        }

    }

    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        MajorityEle(arr);
    }
}
