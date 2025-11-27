import java.util.Scanner;

public class d215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
//10 20 30 40 50
        //2 times
        // 50 10 20 30 40
        //40 50 10 20 30

        //50 40 30 20 10
        //40 50 10 20 30
        arrRotate(arr, k);

    }

    public static void arrRotate(int[] arr, int k) {
        k = k % arr.length;

        rev(arr, 0, arr.length - 1);
        rev(arr, 0, k - 1);
        rev(arr, k, arr.length - 1);


        for (int bb : arr) {
            System.out.println(bb + " ");
        }

    }

    public static void rev(int arr[], int st, int en) {
        while (st < en) {
            int temp = arr[st];
            arr[st] = arr[en];
            arr[en] = temp;

            st++;en--;
        }
    }
}
