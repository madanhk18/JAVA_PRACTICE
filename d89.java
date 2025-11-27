public class d89 {
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 7};
        findEvenOdd(arr);
    }
    public static void findEvenOdd(int []arr){
        int even=0,odd=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Even -> "+ even+ " Odd -> "+ odd);
    }
}
