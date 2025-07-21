public class demo6 {
    public static boolean checkingCase(String word){
        for (int i = 0; i < word.length(); i++) {
            int letter = (int) word.charAt(i);
            if(letter>=97)
                return false;
            boolean check = false; //smaller_letter

            if (letter <= 90 && letter>=65)
                check = true;
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String word="India";
        System.out.println( checkingCase(word));;
    }
}
