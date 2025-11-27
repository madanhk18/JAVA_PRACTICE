import java.util.Arrays;
import java.util.Scanner;

public class d189 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        String arr[]=input.split("\\.");
        int len=arr[0].length();

        boolean isTrue=true;

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() != len) {
                isTrue = false;
                break;
            }
        }
            System.out.println(isTrue);
    }
}
