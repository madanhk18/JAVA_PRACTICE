import java.util.*;

public class st {
    public static void main(String[] args) {
        List<Students> s=new ArrayList<Students>();
        s.add(new Students(1,36));
        s.add(new Students(2,16));
        s.add(new Students(3,76));
        s.add(new Students(4,56));
        s.add(new Students(5,26));

//        Iterator<Students> i=s.iterator();
//            while(i.hasNext()){
//                System.out.println(i.next());
////            }
//        for (Students sh:s) {
//            System.out.println(sh);
//        }

//        Collections.sort(s,(s1,s2)->{
//            return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
//        });

        Comparator<Students> com=new Comparator<Students>() {
        public int compare(Students s1,Students s2){
            if(s1.marks>s2.marks)
                return -1;
           else if(s1.marks<s2.marks)
               return 1;
           else
               return 0;
        }
        };
        Collections.sort(s,com);
        for(Students sh
        :s){
            System.out.println(sh);
        }



    }
}
class Students{
    int roll_no;
    int marks;

    public Students(int roll_no, int marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Students{" +
                "roll_no=" + roll_no +
                ", marks=" + marks +
                '}';
    }
}
