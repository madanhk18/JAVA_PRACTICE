import java.util.Scanner;

public class demo23 {
    public static void CallFunctionsubsequence(String []arr){

    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter K:");
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the words:");
        String arr[]=new String[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("Enter the word character to search");
        String word=sc.nextLine();
        char ch[]=word.toCharArray();
        for (int i=0;i<word.length();i++){
            System.out.print(ch[i]);
        }
        CallFunctionsubsequence(arr);
    }
}
