import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class d175 {
    public static void main(String[] args) {
        int arr[]={4,12,5,3,1,2,5,3,1,2,4,6};
        System.out.println("Array :"+ Arrays.toString(arr));
        findTheNtxGreator(arr);

    }
    public static void findTheNtxGreator(int []arr){
        int res[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for (int i = arr.length-1; i>=0 ; i--) {
            if (st.isEmpty()) {
                res[i] = -1;
                st.push(arr[i]);
            } else {
                if (st.peek() > arr[i]) {
                    res[i] = st.peek();
                } else {
                    while (  !st.isEmpty() && st.peek() <= arr[i]) {
                        st.pop();
                    }
                    if (!st.isEmpty())
                        res[i] = st.peek();
                    else
                        res[i] = -1;
                }
                st.push(arr[i]);
            }
        }
        System.out.println("Result array :"+Arrays.toString(res));
    }
}
