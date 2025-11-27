public class b2 {
    public static void main(String[] args) {
////        String a="1011";
////
////        int res=0;
////        for (int i = 0; i < a.length(); i++) {
////            res=res<<1;
////            res=res+(a.charAt(i)-'0');
////        }
////        System.out.println(res);
//
//        //given x=9;
////        check x is odd value or even value?
//        int x=18;
//        int lastBit=x&1;
//        if(lastBit==0)
//            System.out.println("even");
//        else
//            System.out.println("odd");
//
//        //checking if the number is power if 2 or not
//        int input=8;
//        int val=input &(input-1);
//        String a=val>0 ?"Not a power of 2":"Power of two";
//        System.out.println(a);
//
//        //checking if the kth bit is set or not(It will check from right side)
//        int z=10;
//        int k=2;
//        //1010
//        System.out.println((z&(1<<k)));
//        //to check the place bit is set or not
//        String g="1101";
//        int place=2;
//
//        int res=0;
//        for(int i=0;i<g.length();i++){
//            res=res<<1;
//            res+=g.charAt(i)-'0';
//        }
//        if((res &(1<<place))==0){
//            System.out.println("Its not set");
//        }
//        else
//            System.out.println("It's is set(it has 1 in that place)");


int n=13;
int k=2;
toggleKthBit(n,k);
    }
    public static void toggleKthBit(int n,int k){
        int ans=(n ^ (1<<k));
//     String val=Integer.toBinaryString(ans);
        System.out.println(ans);
        //if 1-based indexing
        int ans2=(n ^ (1<<k-1));
        System.out.println(ans2);
    }
}
