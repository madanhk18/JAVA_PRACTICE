package Recursion;

public class r3 {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        recursionAdd(n,sum);
    }
    public static void recursionAdd(int n,int sum){
        if(n==0) {
            System.out.println(sum);
            return;
        }
        sum+=n;
        recursionAdd(n-1,sum);

    }
}
