package SlidingWindow;

import java.util.*;

public class _02SW {
    public static void main(String[] args) {
//        First Negative Number in every Window of Size K | Sliding Window
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int windSize = 3;
        findFirstNeg(arr, windSize);

    }

    public static void findFirstNeg(int[] arr, int windSize) {
        Deque<Integer> que=new LinkedList<>();

        int i=0,j=0;
        while (j<arr.length){
            if(arr[j]<0)
                que.add(j);

            if((j-i+1)<windSize)
                j++;

            else if((j-i+1)==windSize){
                if(!que.isEmpty())
                    System.out.println(arr[que.peek()]);
                else
                    System.out.println("0");


                if(!que.isEmpty() && que.peek()==i)
                    que.poll();

                i++;j++;
            }
        }
    }
}
