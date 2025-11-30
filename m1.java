import java.util.Stack;

public class m1 {
    public static void main(String[] args) {
        int decimal=10;
        Stack<Integer> st=new Stack<>();
        while (decimal>0){
            int lastBit=decimal&1;
            st.add(lastBit);
            decimal=decimal>>1;
        }
        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}
