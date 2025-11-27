import java.util.*;
public class b1 {
    public static void main(String[] args) {
        int n=13;
//        StringBuilder sb=new StringBuilder();
Stack<Integer> st=new Stack<>();
        while (n>0){
            int lastBit=n&1;

            st.add(lastBit);
            n=n>>1;
        }
        while (st.size()>0){
            System.out.print(st.peek());
            st.pop();
        }
    }
}
