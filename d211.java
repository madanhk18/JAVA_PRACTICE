import java.util.Arrays;

public class d211 {
    public static void main(String[] args) {
        /*8. Rotate an Array

🧩 Problem Statement:

Given an array of integers arr of size n and an integer k, rotate the array to the right by k steps.
You should do this in-place if possible.

Example:

Input:  arr = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]\

         */
        int arr[] ={1,2,3,4,5};
        //left rotate by k
        int k=2;
        revArray(arr,k);
    }
    public static void revArray(int []arr,int k){
        k=k% arr.length;
        swap(arr,0,arr.length-1);
        swap(arr,0,k-1);
        swap(arr,k,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[],int st,int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }
}
