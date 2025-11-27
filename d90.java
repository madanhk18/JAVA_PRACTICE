public class d90 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum = " + findSum(arr));
    }
    public static int findSum(int[] arr) {
    int sum=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
}
