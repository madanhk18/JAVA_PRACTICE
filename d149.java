public class d149 {
    public static void main(String[] args) {
        int arr[]={10,9,2,5,3,7,101,18};
        getLongestSequence(arr);
    }
    public static void getLongestSequence(int []arr){
      int maxLen=0;
        for (int i = 0; i <arr.length ; i++) {
            int len=0;
            for (int j = i+1; j < arr.length; j++) {
                int val=arr[j]; // 9
                if(val >arr[i]) //arr[i] = 10
                    len++;
            }
            maxLen=Math.max(len,maxLen);
        }
        System.out.println(maxLen);
    }
}
