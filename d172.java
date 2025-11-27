import java.util.HashMap;
import java.util.Map;

public class d172 {
    public static void main(String[] args) {
        /*
        Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
         */
        int arr[] = {3,2,2,1,1,1,1,1,3,3,3};
        fun(arr);
    }

    public static void fun(int[] arr) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int n = (arr.length) / 2;
//
//        for (int val : arr) {
//            map.put(val, map.getOrDefault(val, 0) + 1);
//        }
//        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
//            if (e.getValue() > n) {
//                System.out.println(e.getKey());
//                break;
//            }
//        }
        int count = 0, candidate = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        System.out.println(candidate);
    }
}
