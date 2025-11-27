import java.util.*;
public class d235 {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        maxElemenentOfK(arr,k);
    }
    public static void maxElemenentOfK(int []arr,int k){
        List<Integer> list=new ArrayList<>();
        Deque<Integer> dq=new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            if(!dq.isEmpty() && dq.peekFirst()==i-k)
                dq.pollFirst();

            while (!dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
                dq.pollLast();
            }

            dq.addLast(i);
            if(i>=k-1){
                list.add(arr[dq.peekFirst()]);
            }
        }
        System.out.println(list);
    }
}
