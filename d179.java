import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class d179 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        f(arr);
    }
    public static void f(int []arr) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int res[]=new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = (2 * n) - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i % n]) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty()) {
                    res[i%n]=-1;
                } else if (st.peek() > arr[i % n]) {
                    res[i%n]=st.peek();
                }
            }
            st.push(arr[i % n]);
        }
        for(int nz:res){
            list.add(nz);
        }
        System.out.println(list);
    }

}
