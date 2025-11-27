public class demo63 {
    public static void splittingFunction(String name){
        String newname=name.trim();
        String words[]=newname.split(" ");
        int len=words[words.length-1].length();
        System.out.println(len);

    }
    public static void main(String[] args) {
        String name=" Hello World ";
        splittingFunction(name);
    }
}
