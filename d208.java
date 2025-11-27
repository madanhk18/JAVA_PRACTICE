public class d208 {
    public static void main(String[] args) {
        int n=5;
        fac(n);
    }
    public static void fac(int n){
        int res=1;
        for (int i = 1; i <=n ; i++) {
            res=res*i;
        }
        System.out.println(res);
    }
}
