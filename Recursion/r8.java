package Recursion;

import java.util.ArrayList;
import java.util.List;

public class r8 {
    public static void main(String[] args) {
        int arr[]={5,7,8};
//        System.out.println(subsets);
        List<List<Integer>> lists=new ArrayList<>();
        findOutAllSubsets(arr,lists);
        System.out.println(lists);
    }
    public static void findOutAllSubsets(int []arr, List<List<Integer>> lists){
        int n=arr.length;


        int subset=1<<n;
        for (int num=0;num<subset;num++){
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if((num & (1<<i))!=0){
                    list.add(arr[i]);
                }
            }
            lists.add(list);
        }
    }
}
