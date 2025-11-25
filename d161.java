public class d161 {
    public static void main(String[] args) {
        String s="aaac";
        System.out.println( beautySum(s));
    }
    public static int beautySum(String s) {
        // code here
        int beauty=0;
        for(int i=0;i<s.length();i++){
            int freq[]=new int[26];
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch - 'a']++;

                int high=Integer.MIN_VALUE;
                int low=Integer.MAX_VALUE;

                for(int v:freq){
                    if(v>0){
                        high=Math.max(high,v);
                        low=Math.min(low,v);
                    }
                }
                beauty=beauty+(high-low);
            }
        }
        return beauty;
    }
}
