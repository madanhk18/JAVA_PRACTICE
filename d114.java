public class d114 {
    public static void main(String[] args) {
        int arr[][]= {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(getRichElement(arr));;
    }

    public static int getRichElement(int[][] arr) {
       int max=0;
        for (int row = 0; row <arr.length ; row++) {
            int sum=0;
            for (int cols = 0; cols < arr[row].length; cols++) {
                sum+=arr[row][cols];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}
