public class d139 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        String newS=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(newS);

        StringBuilder sb=new StringBuilder(newS);
        if(sb.reverse().toString().equals(newS)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
