import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class MoveZero {

    public static void main(String[] args) {
        int []arr={2,0,4,0,5,0,6};
//        //bruteforce
//        int newArr[]=new int[arr.length];
//        int ind=0;
////        for (int i = 0; i < newArr.length ;i++ ) {
////            if(arr[i]!=0){
////                newArr[ind++]=arr[i];
////            }
////        }
////        for (int n:newArr){
////            System.out.print(n+" ");
////        }
////
//        int ind=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]!=0)
//                arr[ind++]=arr[i];
//        }
//        while(ind<arr.length)
//            arr[ind++]=0;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            // Move j to the left until a non-zero is found
            while (i < j && arr[j] == 0) {
                j--;
            }

            // If arr[i] is 0 and arr[j] is non-zero, swap them
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
