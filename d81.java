import java.util.Scanner;

public class d81 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isPrime=true;

        System.out.println("ENter the number n :");
        int n=sc.nextInt();

        if(n<=1)
            isPrime=false;
        else {
            for (int i=2;i<=Math.sqrt(n);i++){
                if(n%i ==0)
                    isPrime=false;
            }
        }

        if(isPrime=true)
            System.out.println("The number " + n + " is Prime");
         else
            System.out.println("The number " + n + " is not Prime");


    }
}
