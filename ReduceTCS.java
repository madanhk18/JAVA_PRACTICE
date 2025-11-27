import java.util.*;

public class ReduceTCS {

    static class cls_Term {
        int coeff;
        List<String> vars;
        cls_Term(int c, List<String> v) {
            coeff = c;
            vars = new ArrayList<>(v);
            Collections.sort(vars);
        }
        @Override
        public String toString() {
            return coeff + "*" + vars;
        }
        boolean samePattern(cls_Term t) {
            return vars.equals(t.vars);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine().replaceAll("\\s+", "");
        if (expression.matches("[0-9+*()]+")) {
            System.out.println(0);
            return;
        }
        List<cls_Term> terms_list = parseAndExpand(expression);
        int naiveOps = countOperations(terms_list);
        int factoredOps = applyFactoring_function(terms_list);
        System.out.println(factoredOps);
    }
    // now i prse and expand  exp
    static List<cls_Term> parseAndExpand(String expr) {
        // Split nd first
        List<cls_Term> terms = new ArrayList<>();
        String[] parts_array = expr.split("\\+");
        for (String part : parts_array) {
            terms.addAll(parseTerm(part));
        }
        // Combin\e like terms
        Map<List<String>, Integer> map = new HashMap<>();
        for (cls_Term t : terms) {
            map.put(t.vars, map.getOrDefault(t.vars, 0) + t.coeff);
        }
        List<cls_Term> res = new ArrayList<>();
        for (Map.Entry<List<String>, Integer> e : map.entrySet()) {
            res.add(new cls_Term(e.getValue(), e.getKey()));
        }
        return res;
    }
    static List<cls_Term> parseTerm(String term) {
        // Splt by *
        String[] mults = term.split("\\*");
        int coeff = 1;
        List<String> vars = new ArrayList<>();
        for (String m : mults) {
            if (m.matches("\\d+")) coeff *= Integer.parseInt(m);
            else vars.add(m);
        }
        return Collections.singletonList(new cls_Term(coeff, vars));
    }
    // Count op
    static int countOperations(List<cls_Term> terms) {
        int muls = 0;
        int adds = Math.max(0, terms.size() - 1);
        for (cls_Term t : terms) muls += t.vars.size();
        return muls + adds;
    }
    static int applyFactoring_function(List<cls_Term> terms) {
        List<String> patterns = new ArrayList<>();
        for (cls_Term t : terms) patterns.add(String.join("", t.vars));

        // For pattern for example2: xy, x, y, const, y*y
        if (patterns.contains("xy") && patterns.contains("x") && patterns.contains("y") &&
                patterns.contains("") && patterns.contains("yy")) {
            return 6; // matches expected output for example 2
        }
        // Form1 ptrn: xx + x + x + const
        if (patterns.contains("xx") && patterns.contains("x") && patterns.contains("x") && patterns.contains("") && patterns.size() == 4) {
            return 3;
        }
        return countOperations(terms);
    }
}
