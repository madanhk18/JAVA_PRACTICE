public class d123 {
    public static void main(String[] args) {
        int num=926980;
        revNumber(num);
    }
    public static void revNumber(int num){
        int rev=0,r;
        while (num>0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println(rev);
    }
}
