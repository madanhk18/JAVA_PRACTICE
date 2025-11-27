import java.util.Arrays;

public class demo66 {
    public static void main(String[] args) {
        int a[] = {1 ,3, 5, 7};
        int  b[] = {0 ,2, 6, 8 ,9};
        int m=a.length;
        int n=b.length;
        a=Arrays.copyOf(a,m+n);
        for(int i=0;i<n;i++){
            a[m+i]=b[i];
        }
        Arrays.sort(a);
        for(int w:a){
            System.out.println(w);
        }
    }
}
