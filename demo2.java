class Node {
    int data;
    Node next;
    Node back;

    Node(int data){
        this.data=data;
        next=null;
        back=null;
    }
}
    public class demo2 {
    public static Node ConvertArray2TwoDLL(int []arr){
        Node head=new Node(arr[0]);
        Node prev=head;

        for (int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            prev.next=temp;
            temp.back=prev;
            prev=temp;
        }
        return head;
    }

    public static void prints(Node head){
        while(head!=null){
            System.out.print(head.data + "->");
            head=head.next;
        }
    }
    public static Node Deletehead(Node head){
        if(head==null) return null;
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;

        return head;
    }
    public static Node DeleteTail(Node head){
        if(head==null) return head;

        Node tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        Node prev=tail.back;
//        System.out.println("Bother printing prev->"+prev.data);

        tail.back=null;
        prev.next=null;

        return head;

    }
    public static Node DeletingAtKth(Node head,int value){
        if(head==null) return head;

        Node temp=head;
        int count=1;

        while (temp!=null && count<value){
            temp=temp.next;
            count++;
        }

       Node front= temp.next;
        Node prev=temp.back;

        if(front==null && prev==null){
            return null;
        } else if (prev==null) {
            Deletehead(head);
        } else if (front==null) {
            DeleteTail(head);
        }else {
            prev.next=front;
            front.back=prev;
            temp.next=null;
            temp.back=null;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={3,78,2,5,8,12};
        Node head=ConvertArray2TwoDLL(arr);
//        head=Deletehead(head);
//        head=DeleteTail(head);
        head=DeletingAtKth(head,3);
        prints(head);
        String s="577";

    }
}
