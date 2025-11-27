import java.util.*;
public class d228 {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        int cp1[]=arr.clone();
        int cp2[]=arr.clone();

        int ansSmallest=kthSmallest(cp1,2);
        int ansLarge=kthLargest(cp2,2);

        System.out.println("The "+2+" Largest element is "+ansLarge);
        System.out.println("The "+2+" smallest element is "+ansSmallest);

    }
    public static int kthSmallest(int []arr,int k){
        PriorityQueue<Integer> pqMax=new PriorityQueue<>(Collections.reverseOrder());
        HashSet<Integer> seen=new HashSet<>();

        for (int c:arr){

            if(!seen.contains(c)) {
                seen.add(c);
                pqMax.add(c);

                if(pqMax.size()>k)
                    pqMax.poll();
            }
        }
        return pqMax.size()==k?pqMax.peek() : -1;
    }
    public static int kthLargest(int []arr,int k){
        PriorityQueue<Integer> pqMin=new PriorityQueue<>();
        HashSet<Integer> seen=new HashSet<>();

        for (int c:arr){

            if(!seen.contains(c)) {
                seen.add(c);
                pqMin.add(c);

                if(pqMin.size()>k)
                    pqMin.poll();
            }
        }
        return pqMin.size()==k?pqMin.peek() : -1;
    }


}
