import java.util.HashMap;

public class d124 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3};
        int k=2;
        System.out.println(  repeatedOrNot(arr,k));
    }
    public static boolean repeatedOrNot(int []arr,int k){
        if(arr.length<=1)
            return false;

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if(map.containsKey(arr[i])){
                int index=map.get(arr[i]);
                if(Math.abs(index-i)<=k)
                    return true;
            }
            map.put(arr[i],i);
        }
        return false;

    }
}
