public class SplitCirularLLIn2 {
    static Node head1;
    static Node head2;
    public static void splitInTwo(Node head){
        if(head==null){
            return;
        }

        Node sp = head;
        Node fp = head;
        while(fp.next!=head && fp.next.next!=head){
            fp=fp.next.next;
            sp=sp.next;
        }
        //Even loop so moving point 1 ahead to reach head to self loop
        if (fp.next.next==head){
            fp=fp.next;}

        head1=head;
        //at least 2 element
        if(head.next!=head){
            //sp is at mid of loop
            head2=sp.next;
        }
        fp.next=sp.next;
        sp.next=head;
    }
    public static void printLl(Node head){
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String [] args){
        LinkedList linkedList = new LinkedList(new Node(6));
        linkedList.head.next = new Node(3);
        linkedList.head.next.next = new Node(8);
        linkedList.head.next.next.next = new Node(2);
        linkedList.head.next.next.next.next = new Node(1);
        linkedList.head.next.next.next.next.next = linkedList.head;
        head1=null;
        head2 = null;
        splitInTwo(linkedList.head);
        Node h1=head1;
        Node h2=head2;
        boolean s=true;
        while (h1!=head1 || s){
            System.out.println(h1.data);
            h1=h1.next;
            s=false;
        }
        s=true;
        System.out.println("2nd loop");

        while (h2!=head2 || s){
            System.out.println(h2.data);
            h2=h2.next;
            s=false;
        }

    }
}
