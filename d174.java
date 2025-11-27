import java.util.Stack;

public class d174 {
    public static void main(String[] args) {
        String s="()[]{}";
        checkValidParenthesis(s);
    }
    public static void checkValidParenthesis(String s){
        Stack<Character> stack=new Stack<>();

        int j=0;
        while (j<s.length()){
            if(s.charAt(j)=='('|| s.charAt(j)=='{' || s.charAt(j)=='[')
                stack.push(s.charAt(j));

            else{
                if(stack.size()!=0) {
                    if (s.charAt(j) == ')' && stack.peek() == '(' || s.charAt(j) == '}' && stack.peek() == '{' || s.charAt(j) == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        System.out.println("False and end of this line");
                        break;
                    }
                }else
                    System.out.println("Stack is empty so False");

            }
            j++;
        }
        System.out.println("True");
    }
}
