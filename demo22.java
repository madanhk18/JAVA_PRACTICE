public class demo22 {
    public static int StringFuncalling(String name1,String target){
        if(name1.contains(target)){
            System.out.println(target.length());
        }
//        int count=0;
        int len=0;
        int endlen=0;

        for (int i = 0; i < name1.length(); i++) {
            for (int j = 0; j < target.length(); j++) {
                if(name1.charAt(i)==target.charAt(j)){
                    if (target.charAt(0) == name1.charAt(i)) {
                        len = i;
                        break;
                    }
                    if (target.charAt(target.length() - 1) == name1.charAt(j)) {
                        endlen = j;
                        break;
                    }
                }
                else
                    return -1;
            }
        }
                int answer=(endlen-len)+1;
               if(answer>=target.length()){
                   return answer;
               }


return -1;
    }
    public static void main(String[] args) {
    String name1="madazxsxsn";
    String target="dan";
        System.out.println(StringFuncalling(name1,target));
    }
}
