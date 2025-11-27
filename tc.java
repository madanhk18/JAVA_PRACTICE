//public class tc {
//    public static void main(String[] args) {
//        String in="hjajas";
//        int arr[]=new int[26];
//        for (int i = 0; i < in.length(); i++) {
//            arr[in.charAt(i)-'a']++;
//        }
//        String res= "";
//        for (int n=0;n<arr.length;n++){
//            if(arr[n]>0){
//                char c=(char)(n+ 'a');
//                while (arr[n]!=0){
//                    res+=c;
//                    arr[n]--;
//                }
//            }
//        }
//        System.out.println(res);
//    }
//}
public class tc{
    public static void main(String[] args) {
        int arr[]={2,3,-5,5,4,1};
        int k=5;
        int n=13;
        System.out.println(Integer.toBinaryString(n));
    }
}