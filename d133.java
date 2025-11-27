class LLNode{
    int data;
    LLNode next;

    LLNode(int data,LLNode next){
        this.data=data;
        this.next=next;
    }
}

public class d133 {
    public static void printsLL(LLNode head){
        LLNode temp=head;
        while (temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
    }
    public static LLNode addLast(int data,LLNode head){
        LLNode newNode=new LLNode(data,null);
        if(head==null){
            head=newNode;
            return newNode;
        }
        LLNode temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
        return head;
    }
    public static LLNode addFirst(int data,LLNode head){
        LLNode newNode=new LLNode(data,null);
        if(head==null){
            head=newNode;
            return newNode;
        }
        newNode.next=head;
        head=newNode;
        return newNode;
    }
    public static LLNode dltFirst(LLNode head){
        if(head.next==null){
            return null;
        }
        LLNode temp=head;
        head=temp.next;
        temp.next=null;
        return head;
    }
    public static LLNode dltLast(LLNode head){
        if(head.next==null){
            return null;
        }
        LLNode temp=head;
        LLNode prev=head;
        while (temp.next!=null){
            prev=temp;
            temp=temp.next;
        }

        prev.next=null;
        return head;

    }
    public static int lengthLL(LLNode head){
        if(head.next==null)
            return 1;

        int count=0;
        LLNode temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static LLNode deleteAtK(LLNode head,int k){
        LLNode temp=head;
        LLNode prev=head;
        int count=0;
        while (temp!=null){
            count++;
            if(count==k){
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        prev.next=prev.next.next;
        return head;
    }
    public static LLNode insertAtK(int data,int k,LLNode head){
        if(head==null){
            if(k==1){
                LLNode newNode=new LLNode(data,null);
                return head;
            }
        }
        if(k==1){
            LLNode newNode=new LLNode(data,null);
            LLNode temp=newNode;
            temp.next=head;
            temp=head;
        }

        int count=0;LLNode temp=head;
        while (temp!=null){
            count++;
            if(count == (k-1)){
                break;
            }
            temp=temp.next;
        }
        LLNode newNode=new LLNode(data,null);
        newNode.next=temp.next;
        temp.next=newNode;
        return head;

    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3};

        LLNode head=new LLNode(arr[0],null);
        LLNode temp=head;

        for (int i = 1; i <arr.length ; i++) {
            temp.next=new LLNode(arr[i],null);
            temp=temp.next;
        }

//        printsLL(head);
//        System.out.println();
//       head= addFirst(12,head);
//        System.out.println();
//        printsLL(head);
//
//        head=addLast(20,head);
//        printsLL(head);
        head=dltFirst(head);
//        printsLL(head);
    head =dltLast(head);
    head=addLast(4,head);
    head=addLast(5,head);

//        System.out.println(lengthLL(head));
//        deleteAtK(head,3);
//
//        insertAtK(15,2,head);
//        head=duplicateRemove(head);
//        head=revLL(head);
        head=evenOdd(head);
        printsLL(head);
    }
    public static LLNode duplicateRemove(LLNode head){
        LLNode temp=head;LLNode prev=head;
        while(temp!=null){
            if(temp.data!= prev.data){
                prev.next=temp;
                prev=temp;
            }
            if(temp.next==null) {
                prev.next=temp.next;
            }
            temp=temp.next;
        }

        return head;
    }
    public static LLNode revLL(LLNode head){
        LLNode prev=null;LLNode nxt=null;
        LLNode cur=head;

        while (cur != null) {
            nxt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }
        return prev;
    }
    public static LLNode evenOdd(LLNode head){
        LLNode even=head.next;
        LLNode odd=head;
        LLNode evenpoint=even;

        while (even!=null && even.next!=null ){
           odd.next=even.next;
           odd=odd.next;
           even.next=odd.next;
            even=even.next;
        }
        odd.next=evenpoint;
        return head;
    }
}
