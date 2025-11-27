public class d126 {
    public static void main(String[] args) {
        String word="abbac";
       int count=0;
        for (int i = 0; i <word.length() ; i++) {
            count+=countPailindrome(word,i,i); //odd

            count+=countPailindrome(word,i,i+1); //even
        }

        System.out.println(count);
    }
    public static int countPailindrome(String s,int left,int right){
        int count=0;
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;right++;
        }
        return count;
    }
    
}
