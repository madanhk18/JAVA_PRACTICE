public class d158 {
    public static void main(String[] args) {
        String s= "Start Coding Here ";
        String newS=s.trim();
        System.out.println(s);
        System.out.println(newS);
        String []arr=newS.split(" ");
        System.out.println(arr[arr.length-1].length());
    }
}
