package Recursion;

import java.util.ArrayList;
import java.util.List;

public class r9 {
    public static void main(String[] args) {
        int arr[]={3,1,2};

       findOutSubs(0,arr,new ArrayList<>());

    }
    public static void findOutSubs(int index,int [] arr,List<Integer> list){
        if(index==arr.length){
            System.out.println(list);
            return ;
        }
        list.add(arr[index]);
        findOutSubs(index+1,arr,list);
        list.remove(list.size()-1);
        findOutSubs(index+1,arr,list);

    }

}
