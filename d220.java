import java.io.*;

class Studentz implements Serializable {
    int id;
    String name;
    String email;
    int pass;
    Studentz(int id,String name,String email,int pass){
        this.id=id;
        this.name=name;
        this.email=email;
        this.pass=pass;
    }

    @Override
    public String toString() {
        return "Studentz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pass=" + pass +
                '}';
    }
}
public class d220 {

    public static void main(String[] args) throws Exception{
//        File f1=new File("/Users/madanhk/Desktop/MADAN/i.txt");
//       if(f1.exists()){
//           System.out.println("Fil Name:"+f1.getName());
//           System.out.println("Fil Path:"+f1.getAbsolutePath());
//           System.out.println("Fil write:"+f1.canWrite());
//           System.out.println("Fil read:"+f1.canRead());
//           System.out.println("Fil len:"+f1.length());
//       }else
//           System.out.println("failed means alreaday there");
//        FileOutputStream fos=new FileOutputStream("/Users/madanhk/Desktop/MADAN/i.txt");
////        int i=fis.read();
////        while (i!=-1){
////            System.out.print((char)i);
////            i=fis.read();
////        }
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//        Studentz s1=new Studentz(1,"madan","madanhk18@gmail.com",1234);
//        oos.writeObject(s1);
//
        FileInputStream fis=new FileInputStream("/Users/madanhk/Desktop/MADAN/i.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Studentz ans=null;
        ans=(Studentz) ois.readObject();
        System.out.println(ans.toString());
        System.out.println("success");

//        FileOutputStream fos=new FileOutputStream(f1);
//        fos.write(65);
//        String sen="myself Madan H K";
//        byte []bytes=String
        ois.close();
        fis.close();
//        fos.close();
//        oos.close();

    }
}
