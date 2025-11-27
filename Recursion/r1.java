package Recursion;

public class r1 {
    public static void main(String[] args) {
        //prints name madan 5 times
        String name="Mad";
        int n=6;
        recursiveName(0,name,n);
    }
    public static void recursiveName(int i,String name,int n){
        if(i>=n)
            return;
        System.out.println(name);
        recursiveName(i=i+1,name,n);
    }
}
