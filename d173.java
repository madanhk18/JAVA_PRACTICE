import java.util.Stack;

class St{
    public Stack<int []> stack=new Stack<>();

    St(){
    }
    public void push(int val){
        if(stack.isEmpty()){
            stack.push(new int[]{val,val});
        }else{
            int curmin=stack.peek()[1];
            stack.push(new int[]{val,Math.min(val,curmin)});
        }
    }
    public int top(){
        return stack.peek()[0];
    }
    public void popp(){
        stack.pop();
    }
    public int getMin(){
        return stack.peek()[1];
    }
}
public class d173 {
    public static void main(String[] args) {
        St stackCheck=new St();
        stackCheck.push(4);
        stackCheck.push(2);
        stackCheck.push(8);
        stackCheck.push(11);
        stackCheck.push(1);

        stackCheck.popp();
        System.out.println(stackCheck.getMin());
        System.out.println(stackCheck.top());
    }
}
