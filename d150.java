public class d150 {
    public static void main(String[] args) {
        int n=5;
        func(n,n);
    }
    public static void func(int val,int n){
//        if(val>n)
//            return;
//        System.out.println(val);
//        func(val+1,n);
        if(val >0)
            return;

        System.out.println(val);
        func(val-1,n);
    }
}
