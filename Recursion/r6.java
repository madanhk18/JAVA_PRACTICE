package Recursion;

public class r6 {
    public static void main(String[] args) {
        String name="maan";
        System.out.println(funRev(0,name));
    }
    public static boolean funRev(int i,String name){
        if(i>(name.length()/2))
            return true;

        if(name.charAt(i)!=name.charAt(name.length()-i-1))
            return false;

        return funRev(i+1,name);
    }
}
