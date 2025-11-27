import java.util.Arrays;
import java.util.Stack;

public class d184 {
    public static void main(String[] args) {
        int arr[]={5,7,9,6,7,4,5,1,3,7};
        usingStack(arr);
    }
    public static void usingStack(int []arr){
        int res[]=new int[arr.length];
        
        Stack<Integer> st=new Stack<>();

        for (int i = 0; i <arr.length ; i++) {
            while (!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty())
                res[i]=-1;
            else {
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
