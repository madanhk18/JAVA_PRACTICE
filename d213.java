public class d213 {
    public static void main(String[] args) {
        int num1=347;
        int num2=454;

        numCarryTimes(num1,num2);
    }
    public static void numCarryTimes(int n1,int n2){
        int count=0;
        int carry=0;
        int s=(int)Math.max(n1,n2);
        int len=String.valueOf(s).length();
        System.out.println("len is "+len);
        while (len>0){
            int r1=0,r2=0;
            if(n1>0){
                r1=n1%10;
                n1=n1/10;
            }
            if(n2>0){
                r2=n2%10;
                n2=n2/10;
            }

            int ans=r1+r2+carry;
            if(ans>9)
                count++;

            carry=ans/10;
            len--;
        }
        System.out.println(count);
    }
}
