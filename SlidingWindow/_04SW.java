package SlidingWindow;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class _04SW {
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
       int[] res= fun(arr,k);
        System.out.println( Arrays.toString(res));
    }
    public static int[] fun(int []arr,int k) {
        int arr2[] = new int[arr.length - k + 1];
        int index = 0;

        int i = 0, j = 0;
        while (j < arr.length) {
//            if(arr[j]>0) {
//                while (!que.isEmpty()){
//                    if(que.peek()<arr[j])
//                        que.poll();
//                }
//                que.add(j);
//            }

            if ((j - i + 1) < k)
                j++;

            else if ((j - i + 1) == k) {
                int max = 0;
                int m = i;
                while (m <= j) {
                    max = Math.max(max, arr[m]);
                    m++;
                }
                if (max > 0)
                    arr2[index++] = max;
                else
                    arr2[index++] = 0;


//                if(!que.isEmpty() && que.peek()==i)
//                    que.poll();

                i++;
                j++;
            }
        }
        return arr2;
    }
}
