public class d122 {
    public static void main(String[] args) {
        String n1="99";
        String n2="1";
        int carru=0;
        int m=n1.length()-1;
        int n=n2.length()-1;

        StringBuilder sb=new StringBuilder();

        while (n>=0 || m>=0 ||carru!=0){
            int val1=m>=0?(n1.charAt(m) - '0'):0;
            int val2=n>=0?(n2.charAt(n)-'0'):0;

            int sum=val1+val2+carru;
            sb.append(sum%10);
            carru=sum/10;

            m--;n--;
        }
        System.out.println(sb.reverse().toString());
    }
}
