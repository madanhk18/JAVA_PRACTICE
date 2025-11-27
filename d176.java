import java.util.Arrays;
import java.util.Stack;

public class d176 {
    public static void main(String[] args) {
        /*
        496. Next Greater Element I
Solved
Easy
Topics
premium lock icon
Companies
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.



Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.

         */
        int arr1[]={4,1,2};
        int arr2[]={1,3,4,2};
        findNGEI(arr1,arr2);
    }
    public static void findNGEI(int []arr1,int []arr2){
        int res[]=new int[arr2.length];

        Stack<Integer> st=new Stack<>();
        for (int i=arr2.length-1;i>=0;i--){
            while (!st.isEmpty() && st.peek()<=arr2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            st.push(arr2[i]);
        }

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if(arr1[i]==arr2[j]) {
                    arr1[i] = res[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
