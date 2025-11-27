import java.util.HashMap;

public class d135 {
    public static void main(String[] args) {
        int arr[]={1,2,1,1,3,4,2,2,2,2,4};
        //         i
        findMaxOf2bucket(arr);
    }
    public static void findMaxOf2bucket(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();
       int maxFruits=0;
        int left=0;
        for (int right = 0; right <arr.length ; right++) {
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);

            while (map.size()>2) {
                int getCount=map.get(arr[left]);
                if(getCount==1)
                    map.remove(arr[left]);
                else
                    map.put(arr[left], getCount-1);
                left++;
            }
            maxFruits=Math.max(maxFruits,(right-left+1));

        }
        System.out.println(maxFruits);
    }
}
