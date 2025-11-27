import java.util.Arrays;

public class d191 {
    public static void main(String[] args) {
        /*
        2.) Java program to reverse each word of a given string
public static void main(String[] args) {
reverseEachWordOfString("Java is good programming langauges"); }
static void reverseEachWordOfString(String inputString) {
String[] words = inputString.split(" ");
String reverseString = "";
for (int i = 0; i < words.length; i++) {
}
String word = words[i];
String nstr = "";
char ch;
for (int j = 0; j < word.length(); j++) {
ch = word.charAt(j); nstr = ch + nstr;
reverseString = reverseString + nstr + " "; }
System.out.println(inputString);
System.out.println(reverseString);
         */

        String sen="Java is good programming langauges";
        revSen(sen);
    }
    public static void revSen(String sen){
        String arr[]=sen.split("\\s+");
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(arr[i]);
            String ans=reverseWord(arr[i]);
            arr[i]=ans;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static String  reverseWord(String wrd){
        StringBuilder sb=new StringBuilder(wrd);
//        System.out.println(sb.reverse().toString());
        return sb.reverse().toString();

    }
}
