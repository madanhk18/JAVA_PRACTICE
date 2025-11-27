import java.util.Scanner;

public class d113 {
    public static void main(String[] args) {
        //swap without using third element
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=in.nextInt();
        int ans=1;
//        System.out.println("Enter the second number : ");
//        int b=in.nextInt();
//
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("a = "+a + " b = "+b);
//        int i;
//        for (System.out.println("hello"),i=0;i<10;i++){
//            System.out.println("bye");
//        }
        for (int i = a; i >1 ; i--) {
            ans*=i;
        }
        System.out.println(ans);
    }
}
