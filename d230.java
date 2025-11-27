import java.util.*;
public class d230 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        double arr[]=new double[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextDouble();
        }
        double ans=avgOfArrElements(arr);
        System.out.printf("Average of the array elements is %.3f ",ans);
    }
    public static double avgOfArrElements(double []arr){
        double res=0.0;
        for(double c:arr){
            res+=c;
        }
        return res/arr.length;
    }
}
