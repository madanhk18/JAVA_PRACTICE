public class d119 {
    public static void main(String[] args) {
        char[] arr={'a','b','a','c','b','d','a'};
        returnLongestSusbrting(arr);
    }
    public static void returnLongestSusbrting(char[] arr){
        int i=0;int len=0;
        for (int j = 1; j <arr.length ; j++) {
            if(arr[j]==arr[i]){
                i++;
                len=Math.max(len,j-i+1);
            }
        }
        System.out.println(len);
    }
}
