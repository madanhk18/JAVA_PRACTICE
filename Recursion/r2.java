package Recursion;

public class r2 {
    public static void main(String[] args) {
        int n=5;
        recursivePrintN(1,n);
    }
    public static void recursivePrintN(int i,int n){
//        if(i==0)
//            return;
//        System.out.println(i);
//        recursivePrintN(i=i-1,n);

    if(i>n)
        return;
    recursivePrintN(i+1,n);
        System.out.println(i);
    }

}
