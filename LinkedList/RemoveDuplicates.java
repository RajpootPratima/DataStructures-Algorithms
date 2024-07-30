import java.util.HashMap;

public class RemoveDuplicates {
    public static Node removeDups(Node head){
        if(head==null||head.next==null) {
        return head;
        }
        Node current=head;
        Node current2=head;
        while (current!=null){
            Node prev = current;
            current2=current.next;
            while (current2!=null){
                if (current2.data==current.data){
                    prev.next=current2.next;
                    current2.next=null;
                    current2=prev.next;
                }
                else {
                    prev=current2;
                    current2=current2.next;
                }
            }
            current=current.next;
        }
        return head;
    }
    public static void removeDupsUsingHash(Node head){
        if(head==null||head.next==null) {
            return ;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        Node current=head;
        Node prev=head;
        while (current!=null){
            if(map.get(current.data)!=null){
                prev.next=current.next;
                current.next=null;
                current=prev.next;
            }
            else {
                map.put(current.data,1);
                prev=current;
                current=current.next;

            }
        }
//        return head;
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(8);
        ll.head.next.next =  new Node(4);
        ll.head.next.next.next =  new Node(8);
        ll.head.next.next.next.next =  new Node(8);

//        Node newHead = removeDups(ll.head);
//        ReverseLinkedList.printLl(newHead);
        removeDupsUsingHash(ll.head);
        ReverseLinkedList.printLl(ll.head);

    }
}
