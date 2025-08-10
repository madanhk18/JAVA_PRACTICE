import java.util.*;

public class demo41 {
    public static void lexicalAnalysis(String input) {
        int i = 0;

        // Define a set of keywords for easy recognition
        Set<String> keywords = new HashSet<>(Arrays.asList("if", "else", "while", "for", "int", "return"));

        while (i < input.length()) {
            char ch = input.charAt(i);


            if (Character.isLetter(ch)) {
                StringBuilder word = new StringBuilder();
                while (i < input.length() && Character.isLetterOrDigit(input.charAt(i))) {
                    word.append(input.charAt(i));
                    i++;
                }
                String wordStr = word.toString();
                if (keywords.contains(wordStr)) {
                    System.out.println("keyword " + wordStr);
                } else {
                    System.out.println("id " + wordStr);
                }
            }

            else if (ch == '=' || ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == ';' || ch == '(' || ch == ')') {
                System.out.println("operator " + ch);
                i++;
            }

            else if (ch == '>' || ch == '<') {
                StringBuilder relOp = new StringBuilder();
                relOp.append(ch);
                i++;
                if (i < input.length() && (input.charAt(i) == '=' || input.charAt(i) == '>')) {
                    relOp.append(input.charAt(i));
                    i++;
                }
                System.out.println("operator " + relOp.toString());
            }

            else if (Character.isDigit(ch)) {
                StringBuilder number = new StringBuilder();
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    number.append(input.charAt(i));
                    i++;
                }
                System.out.println("num " + number.toString());
            } else {

                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code:");
        String input = sc.nextLine();
        lexicalAnalysis(input);
    }
}
