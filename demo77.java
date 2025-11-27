import java.util.HashMap;

public class demo77 {
    public static void prefixSum(int []arr,int target) {
        int pref[] = new int[arr.length];
        int count=0;
        pref[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int j=0;j< pref.length;j++){
            if(pref[j]==target)
                count++;
            int val=pref[j]-target;
            if(map.containsKey(val)){
                count+=map.get(val);
            }
            map.put(pref[j],map.getOrDefault(pref[j],0)+1);

        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int arr[]={9,4,0,20,3,10,5};
        int target=33;
        prefixSum(arr,target);
    }
}
