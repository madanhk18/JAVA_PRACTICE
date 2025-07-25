class Nodes {
    int data;
    Nodes next;
//    Nodes back;

    Nodes(int data) {
        this.data = data;
        next = null;
//        back = null;
    }
}
    public class demo15 {
//        public static Nodes InsertAtStarting(Nodes head){
//            Nodes newOne=new Nodes(8);
//            newOne.next=head;
//            head.back=newOne;
//            newOne.back=null;
//
//
//            return newOne;
//        }
        public static Nodes ConvertArr2DLL(int []arr){
            Nodes head=new Nodes(arr[0]);
            Nodes prev=head;
            for (int i = 1; i <arr.length; i++) {
                Nodes temp=new Nodes(arr[i]);
                prev.next=temp;
                prev=temp;
            }
            return head;
        }

        public static void prints(Nodes head){
            Nodes temp=head;
            while(temp!=null){
                System.out.print(temp.data+ " ->");
                temp=temp.next;
            }
        }
//        public static Nodes InsertAtTail(Nodes head){
//            Nodes tail=head;
//            Nodes prev=null;
//            while(tail.next!=null){
//                tail=tail.next;
//
//            }
//          Nodes newOne=new Nodes(12);
//            newOne.back=tail;
//            tail.next=newOne;
//            newOne.next=null;
//
//            return head;
//
//        }
//        public static Nodes InsertAtKth(Nodes head,int k){
//            Nodes node=head;
//            int count=0;
//            Nodes prev=null;
//            while (node!=null){
//                count++;
//                if(count==k){ // 8 1 4 3
//                    break;
//                }
//                prev=node;
//                node=node.next;
//            }
//
//            Nodes newOne=new Nodes(10);
//            newOne.next=node;
//            newOne.back=prev;
//
//            prev.next=newOne;
//            node.back=newOne;
//
//            return head;
//
//        }
        public static Nodes ReverseLL(Nodes head){
            Nodes temp=head;
            int headVal=head.data;
            while (temp.next!=null){
                temp.data=temp.next.data;
                temp=temp.next;
            }
            temp.data=head.data;
            return head;
        }
        public static Nodes DeleteMiddleELe(Nodes head) {
            Nodes dummy = head;
            int count = 0;
            while (dummy != null) {
                count++;
                dummy=dummy.next;
            }
            if (count % 2 == 0) {
                int mid=(count / 2) + 1;
                int num=0;
                Nodes temp1 = head;
                Nodes prev = null;
                while (temp1!= null) {
                    num++;
                    if (num == mid) {
                        prev.next=temp1.next;
                        return head;
                    }
                    prev = temp1;
                    temp1 = temp1.next;
                }
            } else if (count % 2 == 1) {
                int mid = (count / 2) + 1;
                int num = 0;
                Nodes temp1 = head;
                Nodes prev = null;
                while (temp1!= null) {
                    num++;
                    if (num == mid) {
                        prev.next=temp1.next;
                        return head;
                    }
                    prev = temp1;
                    temp1 = temp1.next;
                }
            }
        return head;
        }

        public static void main(String[] args) {
            int arr[]={1,4,3,1,3,5};

//            head=InsertAtStarting(head); //val=1
//            head=InsertAtTail(head);
            Nodes head=ConvertArr2DLL(arr);
            int k=4;
//            head=InsertAtKth(head,k);
//            head=ReverseLL(head);
            head=DeleteMiddleELe(head);
            prints(head);
        }

    }


