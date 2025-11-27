import java.util.Stack;

public class d188 {
    public static void main(String[] args) {
        String num="1432219";
        int k=3;
        removeKDigits(num,k);
    }
    public static void removeKDigits(String num,int k){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            int val=num.charAt(i);
            if(st.isEmpty()){
                st.push(num.charAt(i));
            }
            else{
                if(st.peek()>num.charAt(i) && k>0){
                    st.pop();
                    k--;
                } else if (num.charAt(i)<st.peek()) {
                    st.push(num.charAt(i));
                }
            }

        }
    }
}
