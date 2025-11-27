import java.util.Arrays;
import java.util.Stack;

public class d178 {
    public static void main(String[] args) {
        int arr[]={2,10,12,1,11};
        arrayNGE(arr);
    }
    public static void arrayNGE(int []arr){
        Stack<Integer> st=new Stack<>();
        int res[]=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
//            if(st.isEmpty()){
//                res[i]=-1;
//            }else{
//                if(st.peek()>arr[i]){
//                    res[i]=st.peek();
//                }else{
//                    while (!st.isEmpty() && st.peek()<arr[i]){
//                        st.pop();
//                    }
//                    if(st.isEmpty()) res[i]=-1;
//                    else res[i]=st.peek();
//                }
//            }
            while (!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i]=-1;
            else if(st.peek()>arr[i]) res[i]=st.peek();
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
