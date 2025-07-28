public class demo17 {
    public static void ConvertIntoRev(String name){
        String word[]=name.split( " ");

        for (int i = 0; i < word.length; i++) {
            System.out.println(new StringBuilder(word[i]).reverse().toString());;
        }

    }
    public static void main(String[] args) {
        String name="Madan";
        ConvertIntoRev(name);
    }
}
