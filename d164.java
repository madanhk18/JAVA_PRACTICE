import java.util.HashMap;
import java.util.Map;

public class d164 {
    public static void main(String[] args) {
        /*Array Problem 1: Contains Duplicate

Given an integer array nums, return true if any value appears at least twice, and false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false*/
        int arr[]={1,2,3};
        Map<Integer,Integer> map=new HashMap<>();

        for (int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int e:map.keySet()){
            if(map.get(e)>1)
                System.out.println("true");
        }
        System.out.println("false");
    }
}
