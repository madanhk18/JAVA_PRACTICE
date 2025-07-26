import java.util.TreeSet;

class IndNode{
    int data;
    IndNode next;

    IndNode(int data){
        this.data=data;
    }
}
public class demo16 {
    public static IndNode ConvertIntoArr(int []arr){
        IndNode head=new IndNode(arr[0]);
        IndNode prev=head;
        for (int i = 1; i < arr.length; i++) {
            IndNode temp1=new IndNode(arr[i]);
            prev.next=temp1;
            prev=temp1;
        }
        return  head;
    }
    public static void prints(IndNode head){
        IndNode temp=head;

        while(temp!=null){
            System.out.print(temp.data + " ->");
            temp=temp.next;
        }
    }
    public static IndNode FindingMidLL(IndNode head){
        int count=0;
        IndNode temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        IndNode temp1=head;
        IndNode prev=null;
        int mid=(count/2)+1;
        while (temp1!=null){
            mid--;
            if(mid==0){
                prev.next=null;
                return temp1;
            }
            prev=temp1;
            temp1=temp1.next;
        }
        return temp1;
    }
    public static IndNode sortLL(IndNode head){
        TreeSet<Integer> set=new TreeSet<>();
        IndNode temp=head;
        while(temp!=null){
            set.add(temp.data);
            temp=temp.next;
        }
        IndNode temp1=head;
        while (temp1!=null){
            temp1.data=set.pollFirst();
            temp1=temp1.next;
        }
        return head;
    }
    public static void RotateByKTimes(IndNode head,int k){
        IndNode tail=null;
        IndNode prev=head;
        int len=0;
        while (prev!=null){
            len++;
            tail=prev;
            prev=prev.next;
        }
        tail.next=head;
        k=k%len;
        int node=len-k;
        IndNode temp3=head;
        while (temp3!=null){
            node--;
            if (node==0){
                temp3.next=head;
                temp3.next=null;
                break;
            }
            temp3=temp3.next;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,7,4};
        IndNode head=ConvertIntoArr(arr);
//        head=FindingMidLL(head);
//        head=sortLL(head);
        int k=2;
        RotateByKTimes(head,k);
//        prints(head);
    }
}
