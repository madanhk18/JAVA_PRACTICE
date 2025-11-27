package Recursion;

public class r4 {
    public static void main(String[] args) {
        int n=4;
        int sum=1;
        System.out.println(facOfN(n));
    }
    public static int facOfN(int n){
        if(n<1)
            return 1;

        return n*facOfN(n-1);
    }
}
