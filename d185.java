public class d185 {
    public static void main(String[] args) {
        String name1="apple"; //apeoag
        String name2="appl";
        String res1="";
        String res2="";
//        for (int i = 0; i <name1.length() ; i=i+2) {
//            res1+=name1.charAt(i);
//        }
//        for (int i = 0; i < name2.length(); i=i+2) {
//            res2+=name2.charAt(i);
//        }
//        System.out.println(res1.concat(res2));
        if(name1.compareTo(name2)<0){
            System.out.println(name1+" is Smaller than "+name2);
        }else {
            System.out.println(name1+" is Larger than "+name2);
        }
    }
}
