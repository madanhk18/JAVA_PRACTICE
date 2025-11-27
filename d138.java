class DLL{
    int data;
    DLL next;
    DLL prev;

    DLL(int data,DLL next,DLL prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}

public class d138 {
    public static DLL printDLL(DLL head){
        DLL temp=head;
        while (temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={9,7,5,3,6};
        DLL head=new DLL(arr[0],null,null);
        DLL previous=head;
        for (int i = 1; i < arr.length; i++) {
            DLL node=new DLL(arr[i],null,null);
            previous.next=node;
            node.prev=previous;
            previous=node;
        }
        printDLL(head);

    }

}
