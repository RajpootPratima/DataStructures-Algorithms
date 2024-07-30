public class InsertionSort {
    public static Node insertionSort(Node head){
        if(head==null|| head.next==null){
            return head;
        }
        Node sorted=new Node(head.data);
        Node temp,prev;
        head=head.next;
        while (head!=null){
            temp=sorted;
            prev=null;
            while (temp!=null){
               if( head.data<=temp.data){
                   Node insert= new Node(head.data);
                   insert.next=temp;
                   if(prev==null)
                   {sorted=insert;}
                   else{
                       prev.next=insert;
                   }
                   break;
               }
               else{
               prev=temp;
               temp=temp.next;}
            }
            if(temp==null){
                prev.next=new Node(head.data);
                prev.next.next=null;
            }
            head=head.next;
        }
    return sorted;
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(2);
        ll.head.next.next =  new Node(8);
        ll.head.next.next.next =  new Node(6);
        ll.head.next.next.next.next =  new Node(3);
        Node sorted = insertionSort(ll.head);
        ReverseLinkedList.printLl(sorted);
    }
}
