public class d203 {
    public static void main(String[] args) {
//        permutation formula ?
//        given n and r
                int n=4 ,r=2;
                //return n!/(n-r)!
        int num=factorial(n);
        int deno=factorial(n-r);
        System.out.println(num/deno);

    }
    public static int factorial(int val){
        int res=1;
        for (int i = val; i >1 ; i--) {
            res=res*i;
        }
        return res;
    }
}
