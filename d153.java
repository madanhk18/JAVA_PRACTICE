public class d153 {
    public static void main(String[] args) {
        int num=9669;
        String nums=String.valueOf(num);
        StringBuilder sb=new StringBuilder(nums);
        for (int j = 0; j <nums.length() ; j++) {
            if(nums.charAt(j)=='6'){
             sb.setCharAt(j,'9');
             break;
            }
        }
      int val=Integer.valueOf(String.valueOf(sb));
        System.out.println(val);
    }
}
