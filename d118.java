public class d118 {
    public static void main(String[] args) {
        String in="Madan";
        System.out.println( checkForVowels(in));
    }
    public static int checkForVowels(String in){
        String vowels="aeiouAEIOU";
        int count=0;
        for(char c:in.toCharArray()){
            if(vowels.indexOf(c)!=-1)
                count++;
        }
        return count;
    }
}
