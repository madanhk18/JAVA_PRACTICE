import java.util.Scanner;

public class d112 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number until when you want fibonachi number : ");
        int n=sc.nextInt();
            sc.nextLine();

        for (int i=0;i<n;i++){
            System.out.println( fibo(i));
        }
    }
    public static int fibo(int n){
        if(n<2)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}
