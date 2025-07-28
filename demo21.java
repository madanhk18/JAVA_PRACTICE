
import java.util.Scanner;

public class demo21 {
    public  static  void  CallingFun(int []arr){
        int count = 1;
        int val = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
                val = Math.max(val, count);
            }

            else {
                count = 1;
            }


        }
        System.out.println(val);
    }
    public static void main(String[] args) {
        System.out.println("ENter the n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the numbers ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        CallingFun(arr);
    }
}
