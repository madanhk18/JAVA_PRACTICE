package Recursion;

public class r7 {
    public static void main(String[] args) {
        //fibonachi
        int n=4;
        int res=0;
        System.out.println( findNFibo(n,res));
    }
    public static int findNFibo(int n,int sum){
        if(n<=1)
            return n;
        return sum=findNFibo(n-1,sum)+findNFibo(n-2,sum);
    }
}
