public class LinkedListIsPalindrome {
    static boolean even=false;
    public static Node midOfLL(Node head){
        if(head==null)return head;
        Node sp = head;
        Node fp = head;
        while (fp!=null){
            if(fp.next==null){
                break;
            }
            sp=sp.next;
            fp=fp.next.next;
        }
        if(fp==null){
            even=true;
            return sp;

        }
        else{
            even=false;

            return sp.next;
        }
    }
    public static Node reverse(Node head){
        if(head==null || head.next==null)return head;
        Node newhead = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(new Node(4));
        ll.head.next = new Node(6);
        ll.head.next.next =  new Node(6);
        ll.head.next.next.next =  new Node(4);
        ll.head.next.next.next.next =  new Node(4);

        Node mid;
        mid =midOfLL(ll.head);
        mid = reverse(mid);
        Node s=ll.head;
        Node e = mid;
        boolean pali = true;
        while (e!=null ){
            if(s.data!=e.data){
                pali=false;
                break;
            }
            s=s.next;
            e=e.next;
        }
        System.out.println(pali);

    }
}
