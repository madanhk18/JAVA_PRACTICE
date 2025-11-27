public class d83 {
    public static void main(String[] args) {
        String m="madan";

        int left=0;
        int righ=m.length()-1;
        while(left<righ){
            if(m.charAt(left)!=m.charAt(righ))
                System.out.println("not palin");
            left++;righ--;
        }

    }
}
